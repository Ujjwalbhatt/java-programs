class String1
{
public static void main(String args[])
{
String s="Hello";
String s1="XYZ";
String s2="Hello";
//String Length
	System.out.println(s.length());

//Concatenating Strings
System.out.println(s.concat(s1));
System.out.println(s.length());

//String charAt() Method
 	String ss = "Strings are immutable ";
    char result = ss.charAt(8); //a
      System.out.println(result); // a index starts from 0

//equals() method
	System.out.println(s.equals(s1)); //false
	System.out.println(s.equals(s2)); //true

//equalsIgnoreCase() method
	String s3="heLLO"; 
	System.out.println(s.equalsIgnoreCase(s3)); //true

//indexOf() Method
	System.out.println(ss.indexOf('l'));//ANS 19, Starting from 0 to first occurance. If not found then -1

	String Str = new String("Welcome to Tutorial");
      
	System.out.println(Str.indexOf( 'o', 5 )); // 9
	System.out.println("Found Index :" + Str.indexOf( "Tutorial" )); //11

//lastIndexOf()
	System.out.println(s.lastIndexOf( 'e' ));// 1

	//toLowerCase()

	//Java String toUpperCase()

//Java String trim()
	String s5=" ABC ";
	System.out.println(s5.trim()); // it removes starting and ending spaces

//isEmpty()
	String s6="";
	System.out.println(s6.isEmpty());// true if length is 0 otherwise false.

//Java String substring()
String s7="javahere";
System.out.println(s7.substring(2));//vahere, sub string from 2 and onwards
System.out.println(s7.substring(2,4));//va, from 2 to before 4
}
}
