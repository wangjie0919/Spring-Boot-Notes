package com.shumile.springbootmybatis.mapper;

import com.shumile.springbootmybatis.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;
/**
 * 使用xml方式定义数据库操作接口
 */
public interface UserMapperWithXml {

    List<User> getUserList(Map<String, Object> map);

}