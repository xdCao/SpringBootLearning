package MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xdcao on 2017/4/20.
 */
@RestController
public class MyController {


    @Autowired
    private DemoServiceImpl demoService;


    @RequestMapping("/rollback")
    public Person rollback(Person person){
        return  demoService.savePersonWithRollBack(person);

    }


    @RequestMapping("/norollback")
    public Person noRollBack(Person person){
        return  demoService.savePersonWithoutRollBack(person);
    }

}
