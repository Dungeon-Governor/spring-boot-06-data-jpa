package com.he.springboot.Entity;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

//使用jpa注解配置映射关系
//告诉jpa这是一个实体类
@Entity
//和数据库中的表进行绑定映射，如果省略name，那么表明默认就是类名小写
@Table(name = "table_user")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer"})
public class User {
//    表明这是一个主键
    @Id
//    开启主键自增
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    这是和数据表对应的一个列
    @Column(name = "last_name",length = 50)
    private String lastName;
//    省略name，列名默认是属性名
    @Column
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
