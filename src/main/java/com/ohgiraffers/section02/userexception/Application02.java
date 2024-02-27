package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표. 다양한 타입의 예외를 multi block 을 이용해서 처리할 수 있다. */

        /* 필기.
        *   디테일한 예외 상황별로 처리 로직을 다르게 할 수 있다.
        *   이 때 주의할 점은 상위 타입이 catch 블럭 상단에 있을 경우
        *   하단에 작성한 코드는 절대 도달할 수 없는 코드가 되므로 컴파일 에러를 발생시킨다.
        * */

        ExceptionTest et = new ExceptionTest();

        try {                                           // * if-else 와 비슷하다~!!
            et.checkEnoughMoney(30000,20000);
        } catch (PriceNegativeException e) {                 //가격이 음수일때
            //맞는 클래스로 맞게 적용을 해야지만, 밑에도 적용이 된다.(부모???)
            // 첫번째 모두 흡수.
            // 따라서 PriceNegativeException 이 아닌 Exception 만 입력하게 되면, 하위 모두 오류발생됨

            System.out.println("PriceNegativeException 발생!!!");
            //예외 인스턴스 생성시 전달한 메세지를 getMessage() 로 호출할 수 있다.
            System.out.println(e.getMessage());     //음수를 발생할 수 없습니다~~ ???

        } catch (MoneyNegativeException e) {                 //돈이 음수일때

            System.out.println("MoneyNegativeException 발생!!!");
            System.out.println(e.getMessage());

        } catch (NotEnoughMoneyException e) {               // 돈이 충분치 않을때

            System.out.println("NotEnoughMoneyException 발생!!!");
            System.out.println(e.getMessage());

        }

        finally {
            // 예외 발생 여부와 상관 없이 실행할 내용
            System.out.println("finally 블럭의 내용 동작함...");
        }

        System.out.println("프로그램을 종료합니다...");

    }

}
