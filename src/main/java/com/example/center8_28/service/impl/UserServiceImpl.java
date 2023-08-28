package com.example.center8_28.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.center8_28.service.UserService;
import com.example.center8_28.model.domain.User;
import com.example.center8_28.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 86131
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2023-08-28 21:51:24
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {

}




