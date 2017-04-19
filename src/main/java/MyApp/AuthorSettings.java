package MyApp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by xdcao on 2017/4/19.
 */
@Component
@ConfigurationProperties(prefix = "author")
public class AuthorSettings {

    private String name;
    private Long age;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public Long getAge() {
        return age;
    }
}
