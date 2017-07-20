public class FormatPhoneNumber {

    public String removeNonDigit(String input) {

        String[] reFormat = input.split("-");
        String result = "";
        for (int i = 0; i < reFormat.length; i++) {
            result += reFormat[i];
        }

        String[] reFormat2 = result.split(" ");
        String result2 = "";
        for (int i = 0; i < reFormat2.length; i++) {
            result2 += reFormat2[i];
        }

        return result2;
    }

    public String solution(String input) {
        String phoneNumberFormat = String.format("%s-%s-%s",input.substring(0,3),input.substring(3,6),input.substring(6,9));
        return phoneNumberFormat;
    }
}