import java.util.Scanner;
class studentmarks{
    public static void main(String[] args) {
        int n = 3;
        int rollnumber[] = new int[3];
        int marks[][] = new int[10][3];
        int totalmarks[] = new int[10];
        int total = 0;
        int highestmarks[] = new int[3];
        int highestmarksrollnumber[] = new int[3];
        int highestmarksrollnumber1 = 0;
        int highestmarks1 = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.println("Enter the roll number of the student: ");
            rollnumber[i] = sc.nextInt();
            System.out.println("Enter the marks of the student in 3 subjects: ");
            for(int j = 0; j < 3; j++){
                marks[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                total = total + marks[i][j];
            }
            totalmarks[i] = total;
            total = 0;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                if(marks[i][j] > highestmarks[j]){
                    highestmarks[j] = marks[i][j];
                    highestmarksrollnumber[j] = rollnumber[i];
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(totalmarks[i] > highestmarks1){
                highestmarks1 = totalmarks[i];
                highestmarksrollnumber1 = rollnumber[i];
            }
        }
        System.out.println("Roll Number\tSubject 1\tSubject 2\tSubject 3\tTotal Marks");
        for(int i = 0; i < n; i++){
            System.out.print(rollnumber[i]+"\t\t");
            for(int j = 0; j < 3; j++){
                System.out.print(marks[i][j]+"\t\t");
            }
            System.out.println(totalmarks[i]);
        }
        System.out.println("Highest marks in each subject and the roll number of the student");
        for(int i = 0; i < 3; i++){
            System.out.println("Subject "+(i+1)+": "+highestmarks[i]+" and the roll number of the student is: "+highestmarksrollnumber[i]);
        }
        System.out.println("The student who scored the highest marks in the class is: "+highestmarksrollnumber1+" and the marks are: "+highestmarks1);
    }
}
