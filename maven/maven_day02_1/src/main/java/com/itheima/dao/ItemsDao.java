package com.itheima.dao;


import com.itheima.domain.Items;

public interface ItemsDao {
    //通过id查询
    Items findById(Integer id);

}
