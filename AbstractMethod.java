abstract class Animals{
    abstract void foodType();
    abstract void Behaviour();
    
    void sound(){
        System.out.println("Louder");
    }
}
class WildAnimals extends Animals {
    void foodType(){
         System.out.println("Eats the Hunted prey");
    }
    void Behaviour(){
         System.out.println("More vigorous");
    }
}
class Domestic extends Animals {
    void foodType(){
         System.out.println("Eats the Human Providing Foods");
    }
    void Behaviour(){
         System.out.println("More Friendly");
    }
}
public class AbstractMethod{
    public static void main(String[]args){
        Animals obj1 = new WildAnimals();
        obj1.foodType();
        obj1.Behaviour();
        obj1.sound();
        
        Animals obj2 = new Domestic();
        obj2.foodType();
        obj2.Behaviour();
        obj2.sound();
    }
}
