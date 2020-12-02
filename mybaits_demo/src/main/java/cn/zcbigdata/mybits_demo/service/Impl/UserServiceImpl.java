package cn.zcbigdata.mybits_demo.service.Impl;

import cn.zcbigdata.mybits_demo.entity.User;
import cn.zcbigdata.mybits_demo.mapper.UserMapper;
import cn.zcbigdata.mybits_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserMapper userMapper;

    @Override
    public User Select(int id) {
      return userMapper.find(id);
    }


    @Override
    public int Insert(User user) {
        return userMapper.Insert(user);
    }
}
