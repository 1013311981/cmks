//package com.cm.cmks.cmks.DTO;
//
//
//
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * Created by Tiger on 2019/3/26.
// */
//@ControllerAdvice
//@Slf4j
//public class ExceptionHandler {
//    @org.springframework.web.bind.annotation.ExceptionHandler(ExceptionMsg.class)
//    @ResponseBody
//    public Response handleStudentException(HttpServletRequest request, ExceptionMsg ex) {
//        Response response;
//        response = new Response(ex.getResponse().getCode(),ex.getResponse().getMsg());
//        return response;
//    }
//    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
//    @ResponseBody
//    public Response handleException(HttpServletRequest request, Exception ex) {
//        Response response;
//        response = new Response(ErrorCode.NETWORK_ERROR.getCode(),
//                ErrorCode.NETWORK_ERROR.getMsg());
//        return response;
//    }
//}
