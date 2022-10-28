public class nine {
   /* Дана непустая строка S и целое число N (> 0). Вывести строку, со-
    держащую символы строки S, между которыми вставлено по N символов
«*» (звездочка).*/
   public static void main(String[] args) {
       String s ="привет мир";
       String s1="";
       String s2 ="";
       int n =5;
       for (int j=0; j<n; j++)
           s2+="*";
       for (int i = 0; i<s.length();i++)
           s1+=s.charAt(i)+s2;
       System.out.println(s1);
   }

}
