package org.zm.sso.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.zm.sso.entity.SysUser;
import org.zm.sso.mapper.Mapping;
import org.zm.sso.mapper.UserMapper;
import org.zm.sso.service.UserService;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    private final Mapping mapping;

    public UserServiceImpl(Mapping mapping) {
        this.mapping = mapping;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = mapping.findByUsername(username);
        return sysUser;
    }
}
