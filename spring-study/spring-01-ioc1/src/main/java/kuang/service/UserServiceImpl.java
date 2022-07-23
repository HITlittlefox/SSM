package kuang.service;

import kuang.dao.UserDao;
import kuang.dao.UserDaoImpl;
import kuang.dao.UserDaoMysqlImpl;
import kuang.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService {
    //    private UserDao userDao = new UserDaoImpl();
    //    private UserDao userDao = new UserDaoMysqlImpl();
//    private UserDao userDao = new UserDaoOracleImpl();
    private UserDao userDao;

    // 使用set进行动态实现值的注入，实现了IoC控制反转！！！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
