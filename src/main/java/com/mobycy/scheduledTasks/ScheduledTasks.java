package com.mobycy.scheduledTasks;

import com.mobycy.beans.User;
import com.mobycy.dao.UserRepository;
import com.mobycy.service.UserServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
public class ScheduledTasks {

    @Autowired
    UserServiceInterface userService;


    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    private List<User> activeUsers;


    @Scheduled(fixedRate = 15*60*1000)
    public void scheduleTaskWithFixedRate() {
        activeUsers = userService.getActiveUsers();



    }

    public void scheduleTaskWithFixedDelay() {}

    public void scheduleTaskWithInitialDelay() {}

    public void scheduleTaskWithCronExpression() {}
}
