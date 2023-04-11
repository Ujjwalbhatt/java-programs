// Write a java programe to perform the following operations on 2D arrays:
// 1. Read the data from the user
// 2. Display the data
// 3. Find the sum of the elements in the array

import java.util.Scanner;
public class arrays2d {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                sum = sum + a[i][j];
            }
        }
        System.out.println("The sum of the elements in the array is: " + sum);
    }
}
