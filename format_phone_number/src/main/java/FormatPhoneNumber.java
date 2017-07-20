public class FormatPhoneNumber {

    public String removeNonDigit(String input) {
        String[] reFormat = input.split("-");
        String result = reFormat[0]+reFormat[1]+reFormat[2];
        return result;
    }
    public String solution(String input) {
        return null;
    }
}
