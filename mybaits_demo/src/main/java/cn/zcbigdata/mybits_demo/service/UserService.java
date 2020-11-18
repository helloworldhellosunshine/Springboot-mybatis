package cn.zcbigdata.mybits_demo.service;

import cn.zcbigdata.mybits_demo.entity.User;


public interface UserService {

    /**
     * 查
     * @param id
     * @return
     */
    User Select(int id);

    /**
     * 增
     * @param user
     * @return
     */
    int Insert(User user);


}
