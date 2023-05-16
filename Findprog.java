////WAP to apply following function on StirngBUffer object "HELLO"
//i. Append "Java"
//ii. Insert "Java" at index 1
//iii. Replace wwith "Java" with charcter between at index 1 to 2
//iv. Reverse the string HELLO
//v.Delete charcter between index 1 and 2
public class Findprog {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("HELLO");
        sb.append("Java");
        System.out.println(sb);
        sb.insert(1, "Java");
        System.out.println(sb);
        sb.replace(1, 2, "Java");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(1, 2);
        System.out.println(sb);
    }
    
}
