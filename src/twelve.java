public class twelve
{
    /*Даны целые положительные числа N1 и N2 и строки S1 и S2. По-
лучить из этих строк новую строку, содержащую первые N1 символов
строки S1 и последние N2 символов строки S2 (в указанном порядке).*/
    public static void main(String[] args) {
        String s1 ="I believe i can fly";
        String s2= "I love you so much";
        int n1=5;
        int n2=4;
        String s3="";

        char[] ch1 = new char[n1];
        char[] ch2 = new char [n2];
        for (int i=0 ; i<n1;i++){
            ch1[i]=s1.charAt(i);
        s3+=ch1[i];}
        for (int j=0; j<n2;j++){
            ch2[j]=s2.charAt(s2.length()-1-j);
        s3+=ch2[j];}
        System.out.println(s3);

    }
}
