package com.egbert.jpa.service;

import com.egbert.jpa.model.UserDetail;
import com.egbert.jpa.param.UserDetailParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserDetailService {
    public Page <UserDetail> findByCondition(UserDetailParam detailParam, Pageable pageable);
}
