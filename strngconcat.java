//Apply following function on the String "Java"
//i. Try to concat "Welcome" and write down your obeservation
//ii. Find character at index 1
//iii. Find index of first 'a'
//iv. Find index of second 'a'
//v.Compare "java" to "JAVA"
//vi. Compare "Java" to "JAVA" ifnoring the case
//vii. Find the index of first 'a' from last

public class strngconcat {
    public static void main(String[] args) {
        String s = "Java";
        String s1 = "Welcome";
        System.out.println(s.concat(s1));
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('a', 2));
        System.out.println(s.compareTo("JAVA"));
        System.out.println(s.compareToIgnoreCase("JAVA"));
        System.out.println(s.lastIndexOf('a'));
    }
    
}
