package com.mobycy.service;

import com.mobycy.beans.User;

import java.util.List;

public interface UserServiceInterface {

    public void punchIn(String UserId);
    public List<User> getActiveUsers();
}
