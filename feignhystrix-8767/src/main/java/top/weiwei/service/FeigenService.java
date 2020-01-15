package top.weiwei.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.weiwei.forBack.ServiceHystrix;

@FeignClient(value = "client",fallback = ServiceHystrix.class)
public interface FeigenService {

    @GetMapping("/index")
     String sayHi(@RequestParam(value = "name")String name);
}
