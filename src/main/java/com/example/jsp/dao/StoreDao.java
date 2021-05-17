package com.example.jsp.dao;

import com.example.jsp.pojo.Store;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 橙鼠鼠
 */
@Mapper
public interface StoreDao {
    Integer save(@Param("store") Store store);

    void delete(@Param("id") Integer id);

    Store selectById(@Param("id") Integer id);

    List<Store> selectAll();

    void update(@Param("store") Store store);

    Integer getId(@Param("store") Store store);

    Store findIdByLoginUser(@Param("id")Integer userId);
}