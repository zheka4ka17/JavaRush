import java.lang.reflect.Array;
import java.util.Arrays;

public class eleven {
   /* Дано целое положительное число. Вывести символы, изображающие
    цифры этого числа (в порядке справа налево).
    Дана строка, изображающая целое положительное число. Вывести
сумму цифр этого числа
Дана строка, изображающая арифметическое выражение вида
«<цифра>±<цифра>±. . .±<цифра>», где на месте знака операции «±»
находится символ «+» или «−» (например, «4+7−2−8»). Вывести значе-
ние данного выражения (целое число).*/
   public static void main(String[] args) {
       int number = 1236977;
       String s = Integer.toString(number);
       System.out.println(s);
       int sum=0;
       int [] arr = new int[s.length()];
       String [] str= new String[s.length()];
       for (int i=0; i<s.length();i++){
           str[i]=""+ s.charAt(i) ;
           arr[i]= Integer.parseInt(str[i]);
       sum+=arr[i];}
       System.out.println(Arrays.toString(str));
       System.out.println(Arrays.toString(arr));
       System.out.println(sum);
       for(int j=s.length()-1; j>=0;j--)
           System.out.print(arr[j]+ " ");




   }
    }




//sum=s.charAt(0);
//        System.out.println(sum);
//       /*