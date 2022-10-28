import java.util.Arrays;
import java.util.Scanner;

public class two {
    /*Дано целое число N (1 ≤ N ≤ 26). Вывести N первых прописных (то
есть заглавных) букв латинского алфавита.
Дано целое число N (1 ≤ N ≤ 26). Вывести N последних строчных (то
есть маленьких) букв латинского алфавита в обратном порядке (начиная
с буквы «z»).*/

    public static void main(String[] args) {
        System.out.println("Введите целое число от 1 до 26");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int index1= (int) 'A';
        System.out.println(index1);
        char [] chars = new char[n];
        for (int i= 0 ; i<n; i++)
            chars[i]=(char)('A'+ i);
        System.out.println(Arrays.toString(chars));
        char [] chars1 = new char[n];
        for (int i =0; i<n ; i++)
            chars1[i]= (char)('z'-i);
        System.out.println(Arrays.toString(chars1));
    }
}
