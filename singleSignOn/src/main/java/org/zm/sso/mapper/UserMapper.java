package org.zm.sso.mapper;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.zm.sso.entity.SysUser;

import java.util.List;

@Repository("userMapper")
public interface UserMapper {
    @Select("select * from sys_user where username=#{username}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "roles", column = "id", javaType = List.class,
                    many = @Many(select = "org.zm.sso.mapper.RoleMapper.findByUid"))
    })
    public SysUser findByUsername(String username);
}
