package com.example.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    // 1. 实现查询所有用户

    // 2. 根据用户id查询用户

    // 3. 添加新用户

    // 4. 根据用户id删除用户

    // 5. 根据用户id更新用户
    
    @Select("select * from t_user")
    List<User> findAll();

    User findById(Integer id);

    //mybatis的增删改可以定义Integer|Long|boolean三种返回值类型
    void insertUser(User user);

    void updateUser(User user);

    void deleteById(Integer id);


}
