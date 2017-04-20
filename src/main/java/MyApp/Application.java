package MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xdcao on 2017/4/19.
 */
@Controller
@SpringBootApplication
@EnableCaching
public class Application {

//    @Value("${book.author}")
//    private String bookAuthor;
//    @Value("${book.name}")
//    private String bookName;
    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/")
    String index(Model model){
//        return "book name is:"+bookName+" and book author is: "+bookAuthor;
//        return "Author name is "+authorSettings.getName()+" and age is "+authorSettings.getAge();

        Person single=new Person("aa",11);
        List<Person> people=new ArrayList<Person>();
        Person p1=new Person("xx",11);
        Person p2=new Person("yy",22);
        Person p3=new Person("zz",33);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson",single);
        model.addAttribute("people",people);
        return "index";
    }



    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }

}
