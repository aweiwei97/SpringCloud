package top.weiwei.forBack;

import org.springframework.stereotype.Component;
import top.weiwei.service.FeigenService;
@Component
public class ServiceHystrix implements FeigenService {
    @Override
    public String sayHi(String name) {
        return "i am error,"+name;

    }
}
