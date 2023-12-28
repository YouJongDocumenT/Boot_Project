package com.bando.dao;

import java.util.List;

import com.bando.dto.UserDetailsDTO;

public interface UserDAO {
    UserDetailsDTO selectUser(String username);
    List<String> getAuthList(String username); // 반환 유형을 List<String>으로 변경
}
