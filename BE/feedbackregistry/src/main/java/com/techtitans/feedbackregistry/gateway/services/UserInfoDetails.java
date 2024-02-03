package com.techtitans.feedbackregistry.gateway.services;

import com.techtitans.feedbackregistry.core.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserInfoDetails implements UserDetails{

    private String name;
    private String password;
    private List<GrantedAuthority> authorities;


    public UserInfoDetails(User user){
        name = user.getUsername();
        password = user.getPassword();
        authorities = new ArrayList<>();
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getAuthorities();
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
