public class MyRange {
    public String of(String input) {
        return null;
    }

    public int getLastNumber(String input) {
        return 0;
    }

    public boolean isก้ามปูปิด(String input) {
        return false;
    }

    public int getFirstNumber(String input) {
        return input.charAt(1)-48;
    }

    public boolean isก้ามปูเปิด(String input) {
        if(input.startsWith("[")){
            return true;
        }
        return false;
    }
}
