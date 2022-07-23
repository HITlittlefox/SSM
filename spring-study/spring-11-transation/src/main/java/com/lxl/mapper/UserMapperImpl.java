package com.lxl.mapper;

import com.lxl.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectUser() {

        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = ((SqlSession) sqlSession).getMapper(UserMapper.class);

        return mapper.selectUser();
    }
}
