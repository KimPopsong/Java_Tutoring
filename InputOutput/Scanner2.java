package InputOutput;

import java.util.Scanner;

class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Ctrl + Shift + Enter

        String a = scanner.next();
        int b = scanner.nextInt();

        System.out.println(a + b);

        scanner.close();
    }
}
