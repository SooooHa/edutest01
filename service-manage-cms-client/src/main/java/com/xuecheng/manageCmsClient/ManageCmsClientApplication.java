package com.xuecheng.manageCmsClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by IntelliJ IDEA.
 * User: 57251180@qq.com
 * Date: 12/12/2019
 */
@EntityScan("com.xuecheng.framework.domain")
@ComponentScan(basePackages={"com.xuecheng.framework"})
@ComponentScan(basePackages = {"com.xuecheng.manageCmsClient"})
@SpringBootApplication
public class ManageCmsClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageCmsClientApplication.class,args);
    }
}
