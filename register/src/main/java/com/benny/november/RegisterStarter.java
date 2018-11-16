package com.benny.november;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yin.beibei
 * @date 2018/11/16 14:52
 */
@EnableEurekaServer
@SpringBootApplication
public class RegisterStarter {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(RegisterStarter.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);

    }
}
