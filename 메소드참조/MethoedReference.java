package 메소드참조;

import java.util.function.IntBinaryOperator;
// 메소드참조 : 메소드를 참조해서 매개변수의 정보 및 타입을 알아내 불필요한 매개변수 제거.
public class MethoedReference {
    public static void main(String[] args) {
        IntBinaryOperator operator; // 정적메소드 참조.
        operator = (x,y) -> Calculator.staticMethod(x,y);
        System.out.println("결과1 : " + operator.applyAsInt(1,2));
        operator = Calculator::staticMethod;
        System.out.println("결과2 : " + operator.applyAsInt(3,4));
        // 인스턴스 메소드 참조
        Calculator calc = new Calculator();
        operator = (x,y) -> calc.instanceMethod(x,y);
        System.out.println("결과 3 : " + operator.applyAsInt(5,6));

        operator = calc::instanceMethod;
        System.out.println("결과 4 : "+ operator.applyAsInt(7,8));

    }
}

class Calculator {
    static int staticMethod(int x, int y){
        return x + y;
    }
    int instanceMethod(int x , int y){
        return x + y;
    }
}
