package top.aweiwei.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class serviceRibbon {

    @Autowired
    RestTemplate restTemplate;

    public  String service(String name){
        return  restTemplate.getForObject("http://CLIENT/index?name="+name,String.class);
    }

}
