package com.bando.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bando.dto.UserDetailsDTO;

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SqlSession sqlSession;

    @Override
    public UserDetailsDTO selectUser(String username) {
        return sqlSession.selectOne("selectUser", username);
    }

    @Override
    public List<String> getAuthList(String username) {
        return sqlSession.selectList("getAuthList", username); // 반환 유형을 List<String>으로 변경
    }
}
