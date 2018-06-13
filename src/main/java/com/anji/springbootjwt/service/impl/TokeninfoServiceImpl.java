package com.anji.springbootjwt.service.impl;

import com.anji.springbootjwt.model.TokenInfo;
import com.anji.springbootjwt.repository.TokenRepository;
import com.anji.springbootjwt.service.TokeninfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Description:
 * author: chenqiang
 * date: 2018/6/13 9:47
 */
@Service
public class TokeninfoServiceImpl implements TokeninfoService {
    @Autowired
    TokenRepository tokenRepository;

    @Override
    public void saveToken(TokenInfo tokenInfo) {
        tokenRepository.save(tokenInfo);
    }

    @Override
    public TokenInfo findOne(String appId) {
        return tokenRepository.findOne(new Specification<TokenInfo>() {
            @Override
            public Predicate toPredicate(Root<TokenInfo> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                criteriaQuery.where(criteriaBuilder.equal(root.get("appId"),appId));
                return null;
            }
        });
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<TokenInfo> findByName(String name) {
        return null;
    }
}
