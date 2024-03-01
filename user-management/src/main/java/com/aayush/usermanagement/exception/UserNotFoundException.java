package com.aayush.usermanagement.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id){
        super("Could not find th user with id " + id);
    }
}
