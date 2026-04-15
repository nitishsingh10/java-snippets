import java.util.Scanner;

class Launch{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of students");

        int n = scan.nextInt();
        int sum = 0;

        int[] marks = new int[n];

        for(int i = 0 ; i<n ; ++i){

            System.out.println("Enter the marks of student : "+(i+1));
            marks[i] = scan.nextInt();
            sum = sum+marks[i];

        }

        System.out.println("Marks of students are : ");

        for(int i = 0 ; i<n ; ++i){

            System.out.println("the marks of student "+(i+1)+" is : " + marks[i]);

        }

        System.out.println("The Average is : " + (sum/n));

    }

}
