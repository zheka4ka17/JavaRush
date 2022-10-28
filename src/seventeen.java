import java.util.Arrays;
import java.util.Random;

public class seventeen {
    /*Дана строка-предложение на русском языке и число K (0 < K < 10).
Зашифровать строку, выполнив циклическую замену каждой буквы на
букву того же регистра, расположенную в алфавите на K-й позиции после
шифруемой буквы (например, для K = 2 «А» перейдет в «В», «а» — в «в»,
«Б» — в «Г», «я» — в «б» и т. д.). Букву «ё» в алфавите не учитывать, знаки
препинания и пробелы не изменять*/

    public static void main(String[] args) {
        String s1= "привет друг";
        int x = 'я';
        int y='a';
        System.out.println(x);
        Random random= new Random();
        int k= random.nextInt(9)+1;
        System.out.println(k);
        char[] chars = new char[s1.length()];
        for (int i =0; i<s1.length(); i++ ){
            chars[i]=(char) (s1.charAt(i)+k);
        if ((int)chars[i]>x)
            chars[i]=(char)((int)chars[i]-x+y);}
        System.out.println(Arrays.toString(chars));


        }
    }

