package com.lujunxiong.filter;

import com.lujunxiong.wrapper.XssRequestWrapper;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @className: com.lujunxiong.filter-> XssFilter
 * @author: junxiong.lu
 * @createDate: 2021-10-06 11:51
 * @description: 过滤所有提交到服务器的请求参数
 */
public class XssFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        //传入重写后的Request
        filterChain.doFilter(new XssRequestWrapper(request),servletResponse);
    }
}
