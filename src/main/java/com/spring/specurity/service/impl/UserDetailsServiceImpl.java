package com.spring.specurity.service.impl;


import com.spring.specurity.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


/**
 * @author liudongting
 * @date 2019/8/19 14:26
 */

@Service
public class UserDetailsServiceImpl implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("670b14728ad9902aecba32e22fa4f6bd");
        return user;
    }
}
