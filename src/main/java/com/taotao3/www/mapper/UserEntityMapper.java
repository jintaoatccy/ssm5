package com.taotao3.www.mapper;

import com.taotao3.www.po.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2019/2/11.
 */
@Repository
public interface UserEntityMapper {

    List<UserEntity> getAllUsers();
}
