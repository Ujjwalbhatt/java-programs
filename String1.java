class String1 {
    public static void main(String args[]) {
        String s = "java";
        String s1 = s.concat(" Welcome");
        System.out.println(s1);
        char s2 = s.charAt(1);
        System.out.println(s2);
        int s3 = s.indexOf("a", 2);
        System.out.println(s3);
        String str = "JAVA";
        System.out.println(s.equals(str));
        System.out.println(s.equalsIgnoreCase(str));
        int s4 = s.lastIndexOf("a");
        System.out.println(s4);
    }
}
