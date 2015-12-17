package changeName;

import java.util.Scanner;

public class ChangeName {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		String readLine = in.nextLine();
		String newReadLineString = readLine.replace("-", "_");
		newReadLineString = newReadLineString.replace("/", "");
		System.out.println(newReadLineString);
		in.close();
	}
}