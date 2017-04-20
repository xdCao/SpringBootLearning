package MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by xdcao on 2017/4/20.
 */
@Service
public class DemoServiceImpl implements DemoService{

    @Autowired
    private PersonRepository personRepository;

    @Transactional(rollbackFor = {IllegalArgumentException.class})
    @Override
    public Person savePersonWithRollBack(Person person) {
        Person p=personRepository.save(person);
        if (person.getName().equals("caohao")){
            throw new IllegalArgumentException("曹昊已存在，数据回滚");
        }
        return p;
    }

    @Transactional(noRollbackFor = {IllegalArgumentException.class})
    @Override
    public Person savePersonWithoutRollBack(Person person) {
        Person p=personRepository.save(person);
        if(person.getName().equals("caohao")){
            throw new IllegalArgumentException("曹昊虽已存在，但数据不会回滚");
        }
        return p;
    }

    @Override
    @CachePut(value = "people",key = "#person.id")
    public Person save(Person person) {
        Person p=personRepository.save(person);
        System.out.println("为id、key为："+p.getId()+"数据做了缓存");
        return p;
    }

    @Override
    @CacheEvict(value = "people")
    public void remove(Long id) {
        System.out.print("删除了id、key为"+id+"的数据缓存");
        personRepository.delete(id);
    }

    @Override
    @Cacheable(value = "people",key = "#person.id")
    public Person findOne(Person person) {
        Person p=personRepository.findOne(person.getId());
        System.out.println("为id、key为："+p.getId()+"数据做了缓存");
        return p;
    }
}
