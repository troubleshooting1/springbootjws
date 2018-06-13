package com.anji.springbootjwt.repository;

import com.anji.springbootjwt.model.UserInfo;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * Description:
 * author: chenqiang
 * date: 2018/6/13 10:16
 */
public interface UserInfoRepository extends CrudRepository<UserInfo,String>,JpaSpecificationExecutor<UserInfo> {
}
