package org.zm.spring.security.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.zm.spring.security.entity.UserInfo;

import java.util.List;
@Mapper
public interface Mapping {
    List<UserInfo> selectAll();
}
