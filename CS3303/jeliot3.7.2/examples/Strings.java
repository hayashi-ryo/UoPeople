import jeliot.io.*;

public class Strings{
  //Scramble returns a string with the scrambled characters of the
  //two strings
  public static String scramble(String s1, String s2){
    String result = new String();
    int length = (s1.length() < s2.length())? s1.length():s2.length();
    for(int i=0; i < length; i++){
	result += String.valueOf(s1.charAt(i)) + String.valueOf(s2.charAt(i));
    }
    return result;
  }

  public static void main(String [] argv){
      //Enter two, preferably short, strings to be scrambled
      String s1 = Input.readString();
      String s2 = Input.readString();
      
      System.out.println(scramble(s1,s2));
  }
}
