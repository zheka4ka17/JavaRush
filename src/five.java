public class five {
    /*Дано целое число N (> 0) и символ C. Вывести строку длины N,
которая состоит из символов C.*/
    public static void main(String[] args) {
        int n = 10;
        String s = "";
        char ch= 'C';
        for (int i=0; i<n; i++)
            s+=ch ;
        System.out.println(s);

    }
}
