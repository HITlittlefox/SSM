import kuang.dao.UserDaoImpl;
import kuang.dao.UserDaoMysqlImpl;
import kuang.dao.UserDaoOracleImpl;
import kuang.service.UserService;
import kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//public class MyTest {
//    //用户实际调用的是业务层，DAO层他们不需要接触
//    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//
//        ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
//        userService.getUser();
//        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
//        userService.getUser();
//        ((UserServiceImpl) userService).setUserDao(new UserDaoOracleImpl());
//        userService.getUser();
//
//    }
//}
public class MyTest {
    //获取applicationcontext：拿到Spring的容器
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //需要什么，get什么
        UserServiceImpl serviceImpl = (UserServiceImpl) context.getBean("ServiceImpl");
        serviceImpl.getUser();


    }
}
