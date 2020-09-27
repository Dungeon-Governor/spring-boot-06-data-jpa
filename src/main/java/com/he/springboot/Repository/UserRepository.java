package com.he.springboot.Repository;

import com.he.springboot.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//继承JpaRepository来完成对数据库的操作，<>的第一个参数填对应的实体类，第二个参数填主键的类型
public interface UserRepository extends JpaRepository<User,Integer> {
}
