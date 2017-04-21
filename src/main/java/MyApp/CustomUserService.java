package MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;

/**
 * Created by xdcao on 2017/4/21.
 */
public class CustomUserService implements org.springframework.security.core.userdetails.UserDetailsService{

    @Autowired
    private SysUserRepository sysUserRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user=sysUserRepository.findByUsername(username);
        if(user==null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        return user;
    }
}
