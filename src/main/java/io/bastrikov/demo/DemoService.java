package io.bastrikov.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String getMessage(String s){
        String message = s;
        return message;
    }
}
