package MyApp;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xdcao on 2017/4/21.
 */
public interface SysUserRepository extends JpaRepository<SysUser,Long> {

    SysUser findByUsername(String username);

}
