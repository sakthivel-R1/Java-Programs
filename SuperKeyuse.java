class Grand{
    public void Land(){
        System.out.println("100 acers");
    }
}
class Father extends Grand{
    public void Bike(){
        super.Land();
        System.out.println("R15");
    }
}
public class SuperKeyuse{
    public static void main (String [] args){
        Father obj = new Father();
        obj.Bike();
    }
}