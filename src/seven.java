public class seven {
    /*Дана строка. Вывести строку, содержащую те же символы, но рас-
положенные в обратном порядке*/
    public static void main(String[] args) {
        String str = "I believe i can fly";
        String str1= "";
        for (int i =str.length()-1; i>=0; i--)
            str1 +=str.charAt(i);
        System.out.println(str1);

    }
}
