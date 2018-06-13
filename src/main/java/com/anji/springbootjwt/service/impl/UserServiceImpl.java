package com.anji.springbootjwt.service.impl;

import com.anji.springbootjwt.model.UserInfo;
import com.anji.springbootjwt.repository.UserInfoRepository;
import com.anji.springbootjwt.service.UserService;
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
 * date: 2018/6/13 10:17
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserInfoRepository userInfoRepository;

    @Override
    public void saveUser(UserInfo userInfo) {

    }

    @Override
    public UserInfo findOne(String appid) {
        return userInfoRepository.findOne(new Specification<UserInfo>() {
            @Override
            public Predicate toPredicate(Root<UserInfo> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                criteriaQuery.where(criteriaBuilder.equal(root.get("appId"), appid));
                return null;
            }
        });
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<UserInfo> findByName(String name) {
        return null;
    }
}
