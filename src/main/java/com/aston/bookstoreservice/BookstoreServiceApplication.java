package com.aston.bookstoreservice;

import com.aston.commoncode.config.CommonCodeConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication(scanBasePackageClasses = {BookstoreServiceApplication.class,
    CommonCodeConfig.class})
public class BookstoreServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookstoreServiceApplication.class, args);
    }

}
