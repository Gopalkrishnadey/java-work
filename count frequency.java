import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == ' ') {
                continue;
            }

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(ch + " = " + count);
            }
        }

        sc.close();
    }
}