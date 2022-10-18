package Assignment3;
import java.util.Scanner;
public class CompareStrings {
    public static int HelperStringCompare(String a,String b) {
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                continue;
            } else {
                return a.charAt(i) - b.charAt(i);
            }
        }

        return a.length() - b.length();
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String 1: ");
        String s1 = sc.nextLine();
        System.out.print("String 2: ");
        String s2 = sc.nextLine();


        int ans = HelperStringCompare(s1, s2);
        System.out.println(ans);

    }
}
