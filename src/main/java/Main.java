import java.security.SecureRandom;
import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int length = 12;
        String lowereng = "abcdefghijklmnopqrstuvwxyz";
        String uppereng = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String upperru = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String lowerru = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        String rusalph = lowerru + upperru;
        String digits = "0123456789";
        String symbols = "!@#$%^&*()_+-=";

        String combo = lowereng + uppereng + digits + symbols ;

        System.out.println("Do you want your password with russian letters or without? y/n ");
        Scanner scanner = new Scanner(System.in);
        String userinput = scanner.nextLine().toLowerCase().trim();


        if (userinput.equals("y")){
            String ruscombo = combo + rusalph;
            combo = ruscombo;
        }
        if (!userinput.equals("y") && !userinput.equals("n")){
            System.out.println("you bad person");
            return ;
        }
        String result = passgen(combo,length);
        System.out.println("Your secure password is: " + result);

    }
    private static String passgen(String combo2 , int length){
        SecureRandom pass = new SecureRandom();
        int idx = 0;
        String result ="";
        while (idx < length){
            int beb = pass.nextInt(combo2.length());
            result = result + combo2.charAt(beb);
            idx++;
        }return result;
    }
}
