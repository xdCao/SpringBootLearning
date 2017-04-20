package MyApp;

/**
 * Created by xdcao on 2017/4/20.
 */
public interface DemoService {

    Person savePersonWithRollBack(Person person);

    Person savePersonWithoutRollBack(Person person);

    Person save(Person person);

    void remove(Long id);

    Person findOne(Person person);

}
