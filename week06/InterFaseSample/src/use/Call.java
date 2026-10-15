package use;

import used.AddCalc;
import used.SubCalc;
import used.MultiplyCalc;
import used.DivideCalc;
import used.Calculator;


public class Call {
    public static void main(String[] args) {
        Calculator add = new AddCalc();
        Calculator sub = new SubCalc();
        Calculator multiply = new MultiplyCalc();
        Calculator divideCalc = new DivideCalc();

        int result1 = add.calc(10, 5);
        int result2 = sub.calc(10,5);
        int result3 = multiply.calc(10,5);
        int result4 = divideCalc.calc(10,5);

        System.out.println("더하기 결과는 " + result1 + "입니다.");
        System.out.println("빼기 결과는 " + result2 + "입니다.");
        System.out.println("곱하기 결과는 " + result3 + "입니다.");
        System.out.println("나누기 결과는 " + result4 + "입니다.");
    }
}
