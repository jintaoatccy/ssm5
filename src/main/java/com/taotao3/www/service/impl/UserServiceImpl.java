package com.taotao3.www.service.impl;

import com.taotao3.www.mapper.UserEntityMapper;
import com.taotao3.www.po.UserEntity;
import com.taotao3.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/2/11.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityMapper mapper;

    public List<UserEntity> getAllUsers() {
        return mapper.getAllUsers();
    }
}
