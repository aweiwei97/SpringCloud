package top.weiwei.comtroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.weiwei.service.FeigenService;

@RestController
public class feignController {
    @Autowired
    FeigenService feigenService;
    @GetMapping("/index")
    public  String sayHi(@RequestParam(value = "name")String name){
        return feigenService.sayHi(name);
    }
}
