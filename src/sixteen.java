import java.util.Arrays;

public class sixteen {
    /*Дана строка, состоящая из русских слов, разделенных пробелами
        (одним или несколькими). Найти длину самого длинного слова и вывести его.*/
    public static void main(String[] args) {
        String s = "Сравнение — одна из самых частых вещей , которая делается со строками ";
        String[] arr = new String[100];
        int index = 0;
        int index1 = 0;
        char[] chars = new char[s.length()];
        int count = 0;
        String s6="";
        String c = " ";
        String s5 = "";
        for (int j = 0; j < s.length(); j++) {
            chars[j] = s.charAt(j);
            System.out.print(chars[j] + " ");
            s5 = "" + chars[j];
            if (s5.equals(c))
                count++;
        }
        System.out.println();
        for (int i = 0; i < count; i++) {
            index1 = s.indexOf(" ", index);
            arr[i] = s.substring(index, index1);
            index = index1 + 1;
            index1 = 0;
        }
        System.out.println(Arrays.toString(arr));
        int maxLength = Integer.MIN_VALUE;
        int k=0;
        while(arr[k]!=null) {
            if (arr[k].length() > maxLength){
                maxLength = arr[k].length();
             s6 =arr[k];}
        k++;}
            System.out.println(maxLength);
            System.out.println(s6);





    }
}
