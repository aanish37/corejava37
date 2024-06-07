package inheritanceAssingment;

public class Test {
    public static void main(String[] args) {
        
        Parent parentObject = new Parent();          
        Child childObject = new Child();
        parentObject.parentMethod(); 
        childObject.childMethod();
        childObject.parentMethod();
    }
}