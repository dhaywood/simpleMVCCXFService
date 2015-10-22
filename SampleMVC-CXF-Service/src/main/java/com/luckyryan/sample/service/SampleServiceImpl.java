package com.luckyryan.sample.service;

import com.luckyryan.sample.dao.UserDao;
import com.luckyryan.sample.dao.model.User;
import com.luckyryan.sample.exception.InvalidUserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * User: ryan
 * Date: 2/8/13
 */
@Service("sampleService")
public class SampleServiceImpl implements SampleService {

    @Autowired
    UserDao userDao;

    public User saveUser(User user) throws InvalidUserException{

        String firstName = user.getFirstName();

        if(!StringUtils.isEmpty(firstName) && "Dave".equalsIgnoreCase(firstName)) {
            throw new InvalidUserException("Sorry Dave");
        }
        private boolean howTodoIt(String user)
        	// mukadder changes to user profile
        	if(user!=null){
        		throw new RunTimeException("user can not be null");
        				
        }

        return userDao.save(user);

    }
}
