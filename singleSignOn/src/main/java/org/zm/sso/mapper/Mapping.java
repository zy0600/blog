package org.zm.sso.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.zm.sso.entity.SysRole;
import org.zm.sso.entity.SysUser;

import java.util.List;

@Mapper
public interface Mapping {
    public SysUser findByUsername(String username);
    public List<SysRole> findByUid(Integer uid);
}
