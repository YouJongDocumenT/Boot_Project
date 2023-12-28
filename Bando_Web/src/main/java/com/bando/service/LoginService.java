package com.bando.service;

import java.util.List; // ArrayList가 아닌 List import
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bando.dao.UserDAO;
import com.bando.dto.UserDetailsDTO;

@Service("loginService")
public class LoginService implements UserDetailsService {

    @Autowired
    private SqlSession sqlSession;
    
    @Autowired
    private UserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<String> authList; // ArrayList가 아닌 List<String>으로 변경
        
        UserDetailsDTO userDetailsDto = userDAO.selectUser(username);
        authList = userDAO.getAuthList(username);
        
        if (userDetailsDto == null) {
            throw new UsernameNotFoundException(username);
        } else {
            userDetailsDto.setAuthority(authList);
        }
        
        return userDetailsDto;
    }

    // 추가적인 서비스 메서드가 필요하다면 여기에 선언할 수 있습니다.
}
