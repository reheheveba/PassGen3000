import java.util.Random;

class Main {
    public static void main(String[] args) {
        int length = 12;
        String lowereng = "abcdefghijklmnopqrstuvwxyz";
        String uppereng = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String symbols = "!@#$%^&*()_+-=";
        String result = "";
        String combo = lowereng + uppereng + digits + symbols;
        Random pass = new Random();
        int idx = 0;
        while (idx < length){
            int beb = pass.nextInt(combo.length());
            result = result + combo.charAt(beb);
            idx++;
        }

        System.out.println(result);

    }
}
