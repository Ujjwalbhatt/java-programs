import java.util.Scanner;
class TwoDArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rows,columns;
        System.out.println("Enter the number of rows and columns: ");
        rows=sc.nextInt();
        columns=sc.nextInt();
        int arr[][]=new int[rows][columns];
        
        //Inserting
        System.out.println("Enter the elements:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        //Searching
        int key;
        boolean found=false;
        System.out.println("Enter the element to be searched: ");
        key=sc.nextInt();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                if(arr[i][j]==key)
                {
                    System.out.println("Element found at row "+i+" and column "+j);
                    found=true;
                    break;
                }
            }
            if(found)
            break;
        }
        if(!found)
        System.out.println("Element not found");

        //Traversing
        System.out.println("Array Elements are: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
