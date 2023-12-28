package com.bando.dao;

import java.util.List;

import com.bando.dto.UserDetailsDTO;

public interface UserDAO {
    UserDetailsDTO selectUser(String username);
    List<String> getAuthList(String username); // 반환 유형을 List<String>으로 변경
    public void userSignUp(String username, String password, String  enable);
	public void giveAuth(String username, String authority);
}
