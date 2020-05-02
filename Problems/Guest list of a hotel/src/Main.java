//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[8];

        for (int i = 0; i < 8; i++) {
            strings[i] = scanner.next();
        }

        for (int i = strings.length-1; i >= 0; i--) {
            System.out.println(strings[i]);
        }
    }
}