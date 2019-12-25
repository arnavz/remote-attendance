package com.mobycy.service;

import com.mobycy.beans.User;
import com.mobycy.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServiceInterface{

    @Autowired
   UserRepository userRepository;



    @Override
    public void punchIn(String UserId) {
    userRepository.updateUserPunchInPunchOutStatus(UserId);

    }

    @Override
    public List<User> getActiveUsers() {
        return null;
    }
}
