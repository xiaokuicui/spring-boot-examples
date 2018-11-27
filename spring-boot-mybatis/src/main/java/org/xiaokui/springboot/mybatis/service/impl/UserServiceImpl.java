package org.xiaokui.springboot.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xiaokui.springboot.mybatis.domain.User;
import org.xiaokui.springboot.mybatis.mapper.UserMapper;
import org.xiaokui.springboot.mybatis.mapper.UserMapper2;
import org.xiaokui.springboot.mybatis.service.UserService;

import java.util.List;

/**
 * @author xiaokui
 * @Description:UserService实现类
 * @date 2018-04-02 16:55
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserMapper2 userMapper2;

    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public int deleteById(Long id) {
        return userMapper.deleteById(id);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }

    @Override
    public User findUserById(Long id) {
        return userMapper2.findUserById(id);
    }
}
