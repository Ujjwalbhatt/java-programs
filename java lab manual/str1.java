class str1
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("HELLO");
         sb.append("java");
        System.out.println(sb);
        StringBuffer s2=new StringBuffer("HELLO");
        s2.insert(1,"Java");
        System.out.println(s2);
        StringBuffer s3=new StringBuffer("HELLO");
        s3.replace(1,2,"Java");
        System.out.println(s3);
        StringBuffer s4=new StringBuffer("HELLO");
        s4.delete(1,2);
        System.out.println(s4);
        StringBuffer s5=new StringBuffer("HELLO");
         s5.reverse();
        System.out.println(s5);

    }
}
