import java.util.Scanner;

public class three {
    /*Дан символ C, изображающий цифру или букву (латинскую или рус-
            скую). Если C изображает цифру, то вывести строку «digit», если латин-
    скую букву — вывести строку «lat», если русскую — вывести строку «rus».*/
    public static void main(String[] args) {
        System.out.println("Введите символ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char ch = str.charAt(0);
        int index = (int) ch;
        System.out.println(index);
        if (((index>=(int)'A') && (index<=(int)'Z')) || ((index>=(int)'a') && (index<=(int)'z')))
            System.out.println("lat");
        else if (((index>=(int)'А') && (index<=(int)'Я')) || ((index>=(int)'а') && (index<=(int)'я')))
            System.out.println("rus");
        else if ((index>=(int)'0') && (index<=(int)'9'))
            System.out.println("digit");

        }

    }

