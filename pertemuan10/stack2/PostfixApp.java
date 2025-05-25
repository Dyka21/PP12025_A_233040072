package pertemuan10.stack2;

import java.util.Scanner;

public class PostfixApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan ekspresi postfix: ");
        String input = scan.nextLine();

        ParsePost parser = new ParsePost(input);
        int hasil = parser.doParse();

        System.out.println("Hasil: " + hasil);
    }
}
