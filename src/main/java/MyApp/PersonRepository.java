package MyApp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.NamedQuery;
import java.util.List;

/**
 * Created by xdcao on 2017/4/20.
 */
public interface PersonRepository extends JpaRepository<Person,Long> {

    List<Person> findByName(String name);

    Person findByNameAndAddress(String name,String address);

    @Query("select p from Person p where p.name=:name and p.address=:address")
    Person withNameAndAddressQuery(@Param("name")String name,@Param("address")String address);

    Person withNameAndAddressNamedQuery(String name,String address);

}
