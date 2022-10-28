public class fourteen {
    public static void main(String[] args) {
       /* Даны строки S и S0. Проверить, содержится ли строка S0 в строке S.
        Если содержится, то вывести TRUE, если не содержится, то вывести FALSE.

        Даны строки S и S0. Удалить из строки S все подстроки, совпада-
ющие с S0. Если совпадающих подстрок нет, то вывести строку S без
изменений.
        */
        String s1 = "Hello world";
        String s2 = "world";
        int index1= s1.indexOf(s2);
        System.out.println(index1);
       if (index1>0) ;
       String s3="";
        System.out.println(true);
        for (int i=0; i<s2.length(); i++) {
            s3 = s1.replaceAll(s2,"" );
        }
        System.out.println(s3);

    }
}







