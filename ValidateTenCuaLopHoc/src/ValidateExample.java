public class ValidateExample {
    private static Validate validate;
    public static final String [] validClass = new String[]{"C0318G","A0112K","P1992M"};
    public static final String [] invalidClass = new String[]{"M1349K","123456","abcdeg"};

    public static void main(String[] args) {
        Validate validate1 = new Validate();
        for (String v:validClass) {
            boolean isvalid = validate1.validate(v);
            System.out.println("Class is:"+v+"is valid:"+isvalid);
        }
        for (String v:invalidClass) {
            boolean isvalid = validate1.validate(v);
            System.out.println("Class is:"+v+"is valid:"+isvalid);

        }
    }
}
