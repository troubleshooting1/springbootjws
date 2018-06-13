package com.anji.springbootjwt.intercept;

import com.anji.springbootjwt.model.TokenInfo;
import com.anji.springbootjwt.service.TokeninfoService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.security.SignatureException;

/**
 * Description:
 * author: chenqiang
 * date: 2018/6/12 17:30
 */
public class JwtTokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getRequestURI().equals("/api/token") || RequestMethod.OPTIONS.toString().equals(request.getMethod())) {
            return true;
        }

        final String authHeader = request.getHeader("X-YAuth-Token");

        try {
            if (authHeader == null || authHeader.trim() == "") {
                System.out.println("无法获取X-YAuth-Token!");
                throw new SignatureException("无法获取X-YAuth-Token!");
            }

            //获取JWT实体对象接口实例
            final Claims claims = Jwts.parser().setSigningKey("Authv1.0.0").parseClaimsJws(authHeader).getBody();

            //从数据库获取token
            TokenInfo token = getBean(TokeninfoService.class, request).findOne(claims.getSubject());
            String tokenval = new String(token.getToken());

            if (tokenval == null || tokenval.trim() == "") {
                System.out.println("无法获取token信息，请重新获取！");
                throw new SignatureException("无法获取token信息，请重新获取！");
            }

            if (!tokenval.equals(authHeader)) {
                System.out.println("无法获取token信息，请重新获取！");
                throw new SignatureException("无法获取token信息，请重新获取！");
            }
        } catch (SignatureException | ExpiredJwtException e) {
            //输出对象
            PrintWriter writer = response.getWriter();

            //输出error消息
            writer.write("需要输入token");
            writer.close();
            return false;
        } catch (final Exception e) {
            PrintWriter writer = response.getWriter();
            writer.write(e.getMessage());
            writer.close();
            return false;
        }
        return true;
    }

    //根据传入的类型获取spring管理的对应bean
    private <T> T getBean(Class<T> clazz, HttpServletRequest request) {
        BeanFactory factory = (BeanFactory) WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
        return factory.getBean(clazz);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
