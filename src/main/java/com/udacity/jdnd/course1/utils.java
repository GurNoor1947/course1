package com.udacity.jdnd.course1;

import com.udacity.jdnd.course1.controller.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class utils {

    @Bean
    public List<User> getDummyUserList(){
         return new ArrayList<User>(Arrays.asList(new User("Ankit",29),
                 new User("Raju",30)));

    }
}
