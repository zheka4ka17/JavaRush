import java.util.Random;
/*String1. Дан символ C. Вывести его код (то есть номер в кодовой таблице).
String2. Дано целое число N (32 ≤ N ≤ 126). Вывести символ с кодом, рав-
ным N.
String3. Дан символ C. Вывести два символа, первый из которых предшествует
символу C в кодовой таблице, а второй следует за символом C.*/
public class one {
    public static void main(String[] args) {
        char ch= 'C';
        int x = (int) ch;
        System.out.println(x);
        Random random = new Random();
        int y = random.nextInt(96)+32;
        char ch3 = (char) (y);
        char ch1 = (char) (ch-1);
        char ch2 = (char) (ch+1);

        System.out.println(ch1+ " "+ ch2);
        System.out.println(ch3);
            }
        }






