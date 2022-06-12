import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String ClassName_Regex ="^[C,A,P]+[0-9]{4}+[G,H,i,K,L,M]{1}$";

    public Validate() {
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(ClassName_Regex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
