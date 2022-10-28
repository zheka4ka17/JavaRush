public class six {
    /*Дано четное число N (> 0) и символы C1 и C2. Вывести строку
длины N, которая состоит из чередующихся символов C1 и C2, начиная
с C1.*/
    public static void main(String[] args) {
        int n = 10;
        String s = "";
        char c1= 'C';
        char c2='B';
        for (int i=0; i<n; i++)
            if (i%2==0)
            s+=c1 ;
            else s+=c2;
        System.out.println(s);

    }
}
