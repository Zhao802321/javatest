package com.itheima.service;


import com.itheima.domain.Items;

public interface ItemsService {

    //通过id查询
    Items findById(Integer id);
}
