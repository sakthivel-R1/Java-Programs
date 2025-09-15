import java.util.Scanner;
public class TraverseMatrix{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Row and coloumn of Matrix : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        int [][]a = new int [row][col];
        
        System.out.print("Enter the Elements of Matrix: ");
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The traversed Matrix : ");
        
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}


