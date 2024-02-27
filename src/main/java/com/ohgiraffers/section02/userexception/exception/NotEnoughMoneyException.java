package com.ohgiraffers.section02.userexception.exception;

import javax.naming.NoPermissionException;

public class NotEnoughMoneyException extends Exception {

    public NotEnoughMoneyException() {}             //기본생성자

    public NotEnoughMoneyException(String message){
        super(message);         // 출력할 수 있게 부모쪽으로 보내준 것~~


    }

}
