package com.wpf.sericefeign.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Author:pengfei
 * @Description
 * @Date:Created in 17:05 2018/7/17
 * @Modified by
 */
@Component
public class SchedualServiceHiHystric implements FallbackFactory<SchedualServiceHi> {


    @Override
    public SchedualServiceHi create(Throwable throwable) {
        return new SchedualServiceHi() {
            @Override
            public String sayHiFromClientOne(String name) {
                return null;
            }
        };
    }
}
