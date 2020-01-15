package top.aweiwei;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Eurekaclient8763Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurekaclient8763Application.class, args);
    }
    @Value("${server.port}")
    String port;

    @RequestMapping("/index")
    public String test(@RequestParam(value = "name",defaultValue = "我") String name){
        return "hi:"+name+","+port;
    }

}
