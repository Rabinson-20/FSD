package Oct27;
import java.util.Scanner;

public class EmailDomainExtractor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        int atPosition = email.indexOf("@");
        int lastAtPosition = email.lastIndexOf("@");

        String username = email.substring(0, atPosition);
        String domain = email.substring(lastAtPosition + 1);

        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
	}

}