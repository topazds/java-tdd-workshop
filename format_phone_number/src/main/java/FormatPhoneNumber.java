public class FormatPhoneNumber {

    public String removeNonDigit(String input) {

        String[] reFormat = input.split("-");
        String result = "";
        int count = reFormat.length;
        for (int i = 0; i < count; i++) {
            result += reFormat[i];
        }
        String[] reFormat2 = result.split(" ");
        count = reFormat2.length;
        result = "";
        for (int i = 0; i < count; i++) {
            result += reFormat2[i];
        }
        return result;
    }

    public String solution(String input) {
        String data = removeNonDigit(input);

        String phoneNumberFormat = "";
        int count = data.length();
        int start = 0;
        int end = 3;
        for (int i = 0; i < count / 3; i++) {
            phoneNumberFormat += String.format("%s-", data.substring(start, end));
            start += 3;
            end += 3;
        }
        if (count % 3 == 2) {
            phoneNumberFormat += String.format("%s-", data.substring(end - 3, count));
        }

        count = phoneNumberFormat.length();
        String result = phoneNumberFormat.substring(0, count - 1);
        return result;
    }
}