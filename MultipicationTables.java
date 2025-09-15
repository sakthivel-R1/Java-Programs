import java.util.Scanner;
public  class MultipicationTables{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the Tables You need : ");

        int tableNum = sc.nextInt();
        int total=0;
        if(tableNum>=0){
            for(int i=1;i<=10;i++){
                 total = tableNum*i;
                 System.out.println(i+" * "+tableNum+" = "+total);
            }
        
        }
        sc.close();
    }
}
