import java.util.*;

public class Ci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What plain statement do you want to have encrypted...");
        String plain = sc.nextLine();
        System.out.println(" Specify your the value of change you'd ike on your text... ");
        int change = sc.nextInt();
        String encrypted = "";
        char alphabet;