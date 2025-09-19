class Grand{
    public void Land(){
        System.out.println("100 acers");
    }
}
class Father extends Grand{
    public void Bike(){
        
        System.out.println("R15");
    }
}
class Child extends Grand{
    public void Car(){
       
        System.out.println("Porsche");
    }
}

public class Hierarchical{
    public static void main (String [] args){
        Father obj = new Father();
        Child obj1 = new Child();
        obj.Bike();
        obj1.Car();
    }
}