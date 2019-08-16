package com.poldichen.markerspringboot.filter;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import static java.util.Collections.emptyList;

/**
 * @author poldi.chen
 * @className JWTAuthenticationToken
 * @description TODO
 * @date 2019/8/16 16:49
 **/
public class JWTAuthenticationToken extends UsernamePasswordAuthenticationToken{

    private static final long serialVersionUID = 1L;

    public JWTAuthenticationToken(Object principal) {
        super(principal,null,emptyList());
    }

    @Override
    public Object getCredentials() {
        return super.getCredentials();
    }

    @Override
    public Object getPrincipal() {
        return super.getPrincipal();
    }

}
