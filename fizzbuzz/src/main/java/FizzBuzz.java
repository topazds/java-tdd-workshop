public class FizzBuzz {
    public String say(int input) {
        if(input%15==0){
            return "FizzBuzz";
        }else
        if(input%5==0){
            return "Buzz";
        }else
        if(input%3==0){
            return "Fizz";
        }
        return Integer.toString(input);
    }
}
