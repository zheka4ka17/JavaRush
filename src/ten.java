public class ten {
    /* Дана строка, изображающая десятичную запись целого положитель-
ного числа. Вывести строку, изображающую двоичную запись этого же
числа.
Дана строка, изображающая двоичную запись целого положитель-
ного числа. Вывести строку, изображающую десятичную запись этого же
числа.*/
    public static void main(String[] args) {
        String s ="100";
        int x = Integer.parseInt(s);
         String s1 = Integer.toBinaryString(x);
         int y = Integer.parseInt(s1,2);
        System.out.println(s1);
        System.out.println(y);


        String s4="111000010010";
        int z = Integer.parseInt(s4,2);
        String s5 = Integer.toString(z);
        System.out.println(z);





    }
}
