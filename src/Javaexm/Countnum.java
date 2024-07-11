package Javaexm;


public class Countnum
{
public static void main(String[] args) {

String ab= "Hello how are you";
int count=0;
for(int i=0;i< ab.length();i++){
if (ab.charAt(i)!=' ')
count++;
}
System.out.println("Number of chatrecters in string:" +count);
}}