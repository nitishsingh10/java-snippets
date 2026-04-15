import java.util.*;

class Launch{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the no. of class rooms : ");

        int c = scan.nextInt();

        System.out.println("Enter the no. Students in each classroom : ");

        int n = scan.nextInt();


        int [][] a = new int[c][n];

        for(int i = 0 ; i < c ; ++i){

            System.out.println("For Class no : " + (i+1));

            for(int j = 0 ; j < n ; ++j){

                System.out.println("Marks of Student no " + (j+1) + " " + "is : ");

                a[i][j] = scan.nextInt();
            }

        }

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        for(int i = 0 ; i < c ; ++i){

            System.out.println("marks of class " + (i+1));

            for(int j = 0 ; j < n ; ++j){
                
                System.out.println("Marks of Student " + (j+1)+ " " + "is : " + a[i][j]);

            }


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        }


    }

}