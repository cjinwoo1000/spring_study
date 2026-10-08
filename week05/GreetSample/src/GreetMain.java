public class GreetMain{
    public static void main(String[] args){
        Greet moniggreet = new MoningGreet();
        Greet eveningGreet = new EveningGreet();

        moniggreet.greeting();
        eveningGreet.greeting();

    }
}

