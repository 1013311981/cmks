package com.cm.cmks.cmks;

import com.cm.cmks.cmks.until.JwtUtil;
import com.cm.cmks.cmks.until.SmsUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CmksApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmksApplication.class, args);
    }

    @Bean
    public JwtUtil jwtUtil(){
        return new JwtUtil();
    }



}
