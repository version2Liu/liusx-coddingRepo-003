package com.liusx.service.impl;

import com.liusx.entity.User;
import com.liusx.mapper.UserMapper;
import com.liusx.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liusx
 * @since 2020-08-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
