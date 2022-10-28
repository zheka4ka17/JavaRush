public class thirteen {
    public static void main(String[] args) {
        /*Даны целые положительные числа N1 и N2 и строки S1 и S2. По-
лучить из этих строк новую строку, содержащую первые N1 символов
строки S1 и последние N2 символов строки S2 (в указанном порядке).

Дан символ C и строка S. Удвоить каждое вхождение символа C в
строку S.*/

        String str = "Strong mens";
        String str2= str.toLowerCase().replaceAll("s", "SS");
        System.out.println(str2);
        String str3 = " creative director ";
        char c ='c';
        String s5=""+ c;
        String s4= str3.replaceAll( s5 ,"CC");
        System.out.println(s4);
    }
}
