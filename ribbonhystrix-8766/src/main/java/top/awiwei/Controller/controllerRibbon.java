package top.awiwei.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.awiwei.Service.serviceRibbon;

@RestController
public class controllerRibbon {

    @Autowired
    serviceRibbon ribbonService;

    @RequestMapping("/index")
    public  String index(@RequestParam(value = "name",defaultValue = "1111") String name){
        return ribbonService.service(name);
    }

}
