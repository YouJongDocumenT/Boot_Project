package com.bando.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        return sqlSession.selectOne("manageMapper.selectUser", username);
    }

    @Override
    public List<String> getAuthList(String username) {
        return sqlSession.selectList("manageMapper.getAuthList", username); // 반환 유형을 List<String>으로 변경
    }
    
    @Override
    public void userSignUp(String username, String password, String enable) {
    	Map<String, Object> parameters = new HashMap<String, Object>();
	    parameters.put("username", username);
	    parameters.put("password", password);
	    parameters.put("enable", enable);
        sqlSession.insert("manageMapper.userSignUp", parameters);
    }

    @Override
    public void giveAuth(String username, String authority) {
    	Map<String, Object> parameters = new HashMap<String, Object>();
	    parameters.put("username", username);
	    parameters.put("authority", authority);
        sqlSession.insert("manageMapper.giveAuth", parameters);
    }
}
