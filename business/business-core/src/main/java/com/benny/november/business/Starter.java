package com.benny.november.business;

import com.benny.framework.common.net.annotations.CommonNetApiScan;
import com.benny.framework.common.net.annotations.EnableCommonNetClient;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yin.beibei
 * @date 2018/11/20 10:43
 */
@EnableDiscoveryClient
@SpringBootApplication
//@SpringBootApplication(scanBasePackages = {"com.benny.framework.common","com.benny.november.business"})
@EnableCommonNetClient
@CommonNetApiScan(basePackages = "com.benny.november.business.api.*")
public class Starter {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Starter.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);

    }
}
