package main.java.algorithm.binary;

public class Diff389 {

    public char findTheDifference(String s, String t) {

        int sum1=0;
        int sum2=0;
        char[] chars=s.toCharArray();
        char[] chars2=s.toCharArray();
        for(int i=0;i<chars.length;i++){
            sum1=sum1+chars[i];
            sum2=sum2+chars2[i];
        }
        return (char)(sum2+chars2[chars.length]-sum1);
    }



    public char findTheDifference2(String s, String t)  {   int sum1=0;
        int sum2=0;
        char[] chars=s.toCharArray();
        char[] chars2=t.toCharArray();
        for(int i=0;i<chars.length;i++){
            sum1=sum1+chars[i];
            sum2=sum2+chars2[i];
        }
        return (char)(sum2+chars2[chars.length]-sum1);}
}
