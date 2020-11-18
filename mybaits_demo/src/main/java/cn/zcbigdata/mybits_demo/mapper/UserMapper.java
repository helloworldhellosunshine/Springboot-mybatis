package cn.zcbigdata.mybits_demo.mapper;

import cn.zcbigdata.mybits_demo.entity.User;



public interface UserMapper {

    /**
     * 查
     * @param id
     * @return
     */
    User find(int id);

    /**
     * 增
     * @param user
     * @return
     */
    int Insert(User user);


}
