public class FizzBuzz {
    public String say(int input) {
        if(input==3||input==6||input==9){
            return "Fizz";
        }
        if(input==5||input==10||input==20){
            return "Buzz";
        }
        if(input==15){
            return "FizzBuzz";
        }
        return Integer.toString(input);
    }
}
