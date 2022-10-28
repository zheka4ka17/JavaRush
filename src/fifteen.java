public class fifteen {/*
Дана строка, содержащая по крайней мере один символ пробела. Вы-
вести подстроку, расположенную между первым и последним пробелом
исходной строки. Если строка содержит только один пробел, то вывести
пустую строку.*/

    public static void main(String[] args) {
        String s="как дела? нормально? нормально нереально, ок, супер";
        int indexFirst=s.indexOf(" ");
        int indexLast=s.lastIndexOf(" ");
        System.out.println(indexFirst);
        System.out.println(indexLast);
        String s1= s.substring(indexFirst,indexLast);
        System.out.println(s1);

    }
}
