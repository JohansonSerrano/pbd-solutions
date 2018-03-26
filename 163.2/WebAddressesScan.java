import java.net.URL;
import java.util.Scanner;

class Address {
    String street;
    String city;
    String state;
    int zip;
}

public class WebAddressesScan {
    public static void main(String[] args) throws Exception {
        URL addressFile = new URL("https://mrgallo.github.io/problem-files/163/fake-addresses.txt");
        Scanner scan = new Scanner(addressFile.openStream());

		Address[] address1 = new Address[6];
		
		for (int i = 0; i < 6; i++) {
			address1[i] = new Address();
			address1[i].street = scan.nextLine();
			address1[i].city = scan.nextLine();
			address1[i].state = scan.next();
			address1[i].zip = scan.nextInt();
			scan.skip("\n");
		}
        scan.close();

        for (int i = 0; i < 6; i++) {
			System.out.println(address1[i].street + ", " + address1[i].city + ", " + address1[i].state + "  " + address1[i].zip);
		}
	}
}