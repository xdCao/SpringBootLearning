package MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xdcao on 2017/4/19.
 */
@RestController
@SpringBootApplication
public class Application {

//    @Value("${book.author}")
//    private String bookAuthor;
//    @Value("${book.name}")
//    private String bookName;
    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/")
    String index(){
//        return "book name is:"+bookName+" and book author is: "+bookAuthor;
        return "Author name is "+authorSettings.getName()+" and age is "+authorSettings.getAge();
    }


    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }

}
