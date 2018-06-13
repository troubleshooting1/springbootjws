package com.anji.springbootjwt.service;

import com.anji.springbootjwt.model.TokenInfo;

import java.util.List;

/**
 * Description:
 * author: chenqiang
 * date: 2018/6/13 9:45
 */
public interface TokeninfoService {
    public void saveToken(TokenInfo tokenInfo);

    public TokenInfo findOne(String appId);

    public void delete(long id);

    public List<TokenInfo> findByName(String name);
}
