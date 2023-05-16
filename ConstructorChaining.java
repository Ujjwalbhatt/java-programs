//Create the class "Student" having following instance variable and methods
//Instance variables: ID,Name,Branch,city and university
//While Creating constructors with one,two,three,four and five arguments reuse the constructors by construction chaining

class Student {
    int ID;
    String Name;
    String Branch;
    String city;
    String university;

    public Student(int ID, String Name, String Branch, String city, String university) {
        this.ID = ID;
        this.Name = Name;
        this.Branch = Branch;
        this.city = city;
        this.university = university;
    }

    public Student(int ID, String Name, String Branch, String city) {
        this(ID, Name, Branch, city, "DTU");
    }

    public Student(int ID, String Name, String Branch) {
        this(ID, Name, Branch, "Delhi");
    }

    public Student(int ID, String Name) {
        this(ID, Name, "CSE");
    }

    public Student(int ID) {
        this(ID, "Rahul");
        System.out.println("Constructor with one argument");
    }

    
    public String toString() {
        return "Student{" + "ID=" + ID + ", Name=" + Name + ", Branch=" + Branch + ", city=" + city + ", university=" + university + '}';
    }
}
public class ConstructorChaining {

    public static void main(String[] args) {
        Student s = new Student(1);
        System.out.println(s);
    }
    
}
