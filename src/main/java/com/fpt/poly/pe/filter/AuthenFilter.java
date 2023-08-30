package com.fpt.poly.pe.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter(filterName = "AuthenFilter", value = "/sinh-vien/**")
public class AuthenFilter implements Filter   {
    public void init(FilterConfig config) throws ServletException {
        Filter.super.init(config);
        System.out.println("khi init");
    }

    public void destroy() {
        Filter.super.destroy();
        System.out.println("Khi destroy");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(request, response);
        System.out.println("Do filter befor");
        HttpServletRequest red = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
    }
}
