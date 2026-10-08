public class GreetMain{
    public static void main(String[] args){
        // 객체 생성
        Greet moniggreet = new MoningGreet();
        Greet eveningGreet = new EveningGreet();
        //실행
        moniggreet.greeting();
        eveningGreet.greeting();

    }
}

