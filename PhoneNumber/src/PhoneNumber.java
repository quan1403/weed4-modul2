import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String NumberPhone_Regex ="^\\([0-9]{2}\\)\\-\\([0]{1}[0-9]{9}\\)$";
    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(NumberPhone_Regex);
        Matcher matcher = pattern.matcher(regex);

        return matcher.matches();
    }

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số đt");
        if (phoneNumber.validate(sc.nextLine())){
            System.out.println("đúng rồi");
        }else {
            System.out.println("sai rồi");
        }
    }


}


