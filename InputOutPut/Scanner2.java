package InputOutPut;

import java.util.Scanner;
import java.util.*;  // *은 java.util에 있는 모든 모듈을 포함한다는 의미

class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Ctrl + Shift + Enter

        String a = scanner.next();
        int b = scanner.nextInt();

        System.out.println(a + b);

        scanner.close();
    }
}
