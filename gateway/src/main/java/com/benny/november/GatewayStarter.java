package com.benny.november;

import com.benny.common.net.annotations.CommonNetApiScan;
import com.benny.common.net.annotations.EnableCommonNetClient;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author yin.beibei
 * @date 2018/11/16 14:52
 */
@EnableZuulProxy
@SpringBootApplication
@EnableCommonNetClient
@CommonNetApiScan(basePackages = "com.benny.archetype.business.api")
public class GatewayStarter {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(GatewayStarter.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);

    }
}
