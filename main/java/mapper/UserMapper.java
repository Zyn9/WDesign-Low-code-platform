package mapper;

import Pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    //用户注册
    void addUser(User user);
    //根据用户名和密码查询用户
    /*@param表示mybatis参数
    一般当接口中的参数大于1个的时候，我们使用该注解
    @param account
    @param pwd
    @return
     */
    User findUserByUsernameAndPassword(
            @Param("account") String account,
            @Param("pwd") String pwd);
}
