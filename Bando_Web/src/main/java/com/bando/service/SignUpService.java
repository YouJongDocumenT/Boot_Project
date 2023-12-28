package com.bando.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.bando.dao.UserDAO;
import com.bando.dto.UserDetailsDTO;

@Service("signUpService")
@Transactional
public class SignUpService {

    @Autowired
    private BCryptPasswordEncoder bPasswordEncoder;

    @Autowired
    private UserDAO userDao;

    public boolean insertUserInfo(String username, String password) {
        UserDetailsDTO user = userDao.selectUser(username);
        if (user != null) {
            return false; // 이미 사용자가 존재하면 false 반환
        } else {
            String encodedPassword = bPasswordEncoder.encode(password);
            userDao.userSignUp(username, encodedPassword, "1"); // 사용자 등록
            userDao.giveAuth(username, "ROLE_USER"); // 기본 권한 부여
            return true; // 사용자 등록 성공시 true 반환
        }
    }
}
