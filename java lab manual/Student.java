class Student {
    int ID;
    String name;
    String branch;
    String university;

    void setDetails(int id, String name, String branch, String university) {
        ID = id;
        this.name = name;
        this.branch = branch;
        this.university = university;
    }

    void showDetails() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("University: " + university);
    }
}

 class Mainv {
    public static void main(String[] args) {
        Student student = new Student();
        student.setDetails(1234, "Aman Rawat", "Computer Science", "XYZ University");
        student.showDetails();
    }
}