package top.awiwei.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class serviceRibbon {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "Error")
    public  String service(String name){
        return  restTemplate.getForObject("http://CLIENT/index?name="+name,String.class);
    }

    public String Error(String name){
        return  name+",I am error.";
    }

}
