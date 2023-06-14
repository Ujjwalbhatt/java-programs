class Student
{
    int ID;
    String Name,Branch,city,university;
    Student(int ID)
    {
        this.ID=ID;
    }
    Student(int ID,String Name)
    {
        this(ID);
        this.Name=Name;
    }
    Student(int ID,String Name,String Branch)
    {
        this(ID,Name);
        this.Branch=Branch;
    }
    Student(int ID,String Name,String Branch,String city)
    {
        this(ID,Name,Branch);
        this.city=city;
    }
    Student(int ID,String Name,String Branch,String city,String university)
    {
        this(ID,Name,Branch,city);
        this.university=university;
    }
    void showDetails()
    {
        System.out.println(this.ID);
        System.out.println(this.Name);
        System.out.println(this.Branch);
        System.out.println(this.city);
        System.out.println(this.university);
    }
    
    public static void main(String args[])
    {
        Student s1=new Student(123,"ABC","CSE","Dehradun","GEHU");
        s1.showDetails();
    }
}
