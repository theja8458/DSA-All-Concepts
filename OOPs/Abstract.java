public class Abstract {
    public static void main(String args[]){

        // Horse h=new Horse();
        // h.eat();
        // h.walk();

        // Chicken ch=new Chicken();
        // ch.eat();;
        // ch.walk();
        Mustang myHosre=new Mustang();
        //Animal -> Horse -> Mustang
        

    }
}

abstract class Animal{
    Animal(){
        System.out.println("Animal Constructor is called");
    }
    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();   
}

class Horse extends Animal{
     Horse(){
        System.out.println("Horse constructor is called");
     }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}