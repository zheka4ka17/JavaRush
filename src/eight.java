public class eight {
  /*  Дана непустая строка S. Вывести строку, содержащую символы стро-
    ки S, между которыми вставлено по одному пробелу.*/
  public static void main(String[] args) {
      String s ="привет мир";
      String s1="";
      for (int i = 0; i<s.length();i++)
          s1+=s.charAt(i)+" ";
      System.out.println(s1);
  }
}
