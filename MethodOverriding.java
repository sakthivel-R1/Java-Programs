class Trainer{
    public void Feedback(){
        System.out.println("Poor");
    }
}
class Students extends Trainer{
    public void Feedback(){
        
        System.out.println("Good ");
    }
}
class BatchIot extends Students{
    public void Feedback(){
       
        System.out.println("Excellent Performance");
    }
}

public class MethodOverriding{
    public static void main (String [] args){
        
        Trainer obj1 = new Students();
        obj1.Feedback();
        
        Trainer obj2 = new BatchIot();
        obj2.Feedback();
        
    }
}


