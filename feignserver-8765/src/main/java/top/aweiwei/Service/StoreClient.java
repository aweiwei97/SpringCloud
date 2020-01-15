package top.aweiwei.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("client")
public interface StoreClient {

    @RequestMapping(value = "/index")
    String update(@RequestParam(value = "name",defaultValue = "1212")String name);
}