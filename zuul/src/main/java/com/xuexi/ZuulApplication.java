package com.xuexi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableZuulProxy  //包含了 @EnableZuulServer ，设置该类是⽹关的启动类。
@EnableAutoConfiguration  //自动装载配置
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}

//  访问时  http://localhost:8030/p/student/index