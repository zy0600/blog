package org.zm.sso.mapper;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.zm.sso.entity.SysRole;

import java.util.List;

@Repository("roleMapper")
public interface RoleMapper {
    @Select("SELECT r.id, r.role_name roleName, r.role_desc roleDesc " +
            "FROM sys_role r, sys_user_role ur " +
            "WHERE r.id=ur.rid AND ur.uid=#{uid}")
    public List<SysRole> findByUid(Integer uid);
}
