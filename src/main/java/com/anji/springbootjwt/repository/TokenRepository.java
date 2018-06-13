package com.anji.springbootjwt.repository;

import com.anji.springbootjwt.model.TokenInfo;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * Description:
 * author: chenqiang
 * date: 2018/6/13 9:48
 */
public interface TokenRepository extends CrudRepository<TokenInfo,Integer>,JpaSpecificationExecutor<TokenInfo> {
}
