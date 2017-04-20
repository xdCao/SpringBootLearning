package MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xdcao on 2017/4/20.
 */
@RestController
public class CacheController {

    @Autowired
    private DemoServiceImpl demoService;

    @RequestMapping("/put")
    public Person put (Person person){
        return demoService.save(person);
    }

    @RequestMapping("/able")
    public Person cacheable(Person person){
        return demoService.findOne(person);
    }


    @RequestMapping("/evit")
    public String evit(Long id){
        demoService.remove(id);
        return "ok";
    }

}
