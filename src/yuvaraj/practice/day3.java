package yuvaraj.practice;

public class day3 {
//public void Compare(String yuvi,String yuvi1) {
	

	
	
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String yuvi="yuvaraj";

String yuvi1="yuvaraj";
String ram=new String("ravi");
String ram1=new String("ravi");
if(yuvi==yuvi1) System.out.println(" Is yuvi == yuvi1");
System.out.println(yuvi==yuvi1);
if(yuvi.equals(yuvi1)) System.out.println("iS yuvi .equals yuvi1");
System.out.println(yuvi.equals(yuvi1));
 System.out.println(" Is Ram ==  ram1");
System.out.println(ram==ram1);
if(ram.equals(ram1)) System.out.println("Is ram .equals ram1");
System.out.println(ram.equals(ram1));
System.out.println(yuvi.concat("raju"));

StringBuffer kal=new StringBuffer ("yuviraj");

System.out.println(kal.append("rajukumar"));
System.out.println(kal);
System.out.println();
String[] yu=yuvi.split("u",5);
for (String a : yu)
    System.out.println(a);
System.out.println(yu.toString());
System.out.println();
//Substring get a substring from a string test.substring(Start index, end index)
	}

}
