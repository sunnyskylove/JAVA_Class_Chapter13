package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {

        if (price < 0) {
            throw new PriceNegativeException("상품의 가격은 음수일 수 없습니다.");
            // 1. 임의의 클래스를 만들어서 오류> alt+enter > class 생성!!>>> 오류남..
            // 2. 새로 패키지(exception)와 클래스(NegativeException, 상속PriceNegativeException) 생성
            // 3. import 후, 다시 alt+enter >  첫번째 것으로 선택 >>>throw 뒤에 추가된 것 볼 수 있다!
        }

        if(money < 0) {
            throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
        }

        if(money < price){
            throw new NotEnoughMoneyException("가진 돈보다 상품 가격이 비쌉니다~~~");

        }

        System.out.println("가진 돈이 충분합니다. 즐거운 쇼핑 하세요~~♬");

    }

}
