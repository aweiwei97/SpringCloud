package top.aweiwei.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.aweiwei.Service.StoreClient;

@RestController
public class controller {

    @Autowired
    StoreClient storeClient;
    @GetMapping("/index")
    public String index(@RequestParam String name){
        return  storeClient.update(name);
    }


}
