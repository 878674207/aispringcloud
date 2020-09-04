package com.xuexi.feign;


import com.xuexi.entity.Student;
import com.xuexi.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Collection;

@Component
@FeignClient(value = "provider",fallback = FeignError.class) //访问这个接口时，成功就去找provider，失败就去找FeignError
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();
    @GetMapping("/student/index")
    public String index();
}