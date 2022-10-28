import java.util.Scanner;

public class four {
    /*Дана непустая строка. Вывести коды ее первого и последнего символа.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //char ch1= str.charAt(0);
        //char ch2= str.charAt(str.length()-1);

        int index1 = str.charAt(0);
        int index2 = str.charAt(str.length()-1);

        System.out.println(index1 + " "+ index2);
     }
}
