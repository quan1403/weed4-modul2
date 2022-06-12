public class AccountEmxampleTest {
    public static final String [] validAcount = new String[]{"123abc_","_abc123"};
    public static final String [] invalidAccount = new String[]{".@","12345","1234_"};

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (String account:validAcount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is"+account+"is valid:"+isvalid);

        }
        for (String account :invalidAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is"+account+"is valid"+isvalid);

        }

    }
}
