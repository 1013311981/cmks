//package com.cm.cmks.cmks.interceptor;
//
//import com.cm.cmks.cmks.until.JwtUtil;
//import io.jsonwebtoken.Claims;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//

//@Component
//public class JwtInterceptor extends HandlerInterceptorAdapter {
//
//    @Autowired
//    private JwtUtil jwtUtil;
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        System.out.println("经过了拦截器");
//        System.out.println(jwtUtil.getKey());
//        System.out.println(jwtUtil.getTtl());
//        String header = request.getHeader("Authorization");
//
//        if (header != null && !"".equals(header)) {
//
//            if (header.startsWith("Bearer ")) {
//                String token = header.substring(7);
//                try {
//                    Claims claims = jwtUtil.parseJWT(token);
//                    String roles = (String) claims.get("roles");
//                    if (roles != null && roles.equals("admin")) {
//                        request.setAttribute("claims_admin", token);
//                    }
//                    if (roles != null && roles.equals("user")) {
//                        request.setAttribute("claims_user", token);
//                    }
//                } catch (RuntimeException e) {
//                    throw new RuntimeException("令牌有误");
//                }
//            }
//        }
//        return true;
//    }
//}
