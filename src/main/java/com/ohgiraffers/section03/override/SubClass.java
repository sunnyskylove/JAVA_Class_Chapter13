package com.ohgiraffers.section03.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {

    // #예외 없이 오버라이딩 할 수 있다.
//    @Override
//    public void method() { }                  // 정상


    // #같은 예외를 던져주는 구문으로 오버라이딩 해야한다.
//@Override
//public void method() throws IOException {}      // 정상


    // #부모의 예외처리 클래스보다 상위타입 예외로는 후손클래스에서 오버라이딩 할 수 없다.
    // ▶ 부모보다 더 높은 클래스로는 건너띄기 할 수 없다. (부모와 같거나 작은 것들은 가능하다!)
//    @Override
//    public void method() throws Exception {}     // 비정상,에러


    // 하지만 부모의 예외처리 클래스보다 더 하위에 있는 예외(즉 더 구체적인 예외상황) 인 경우 오버라이딩 가능
@Override
public void method() throws FileNotFoundException {}   // 정상

}
