public class Inheritence {
    public static void main(String args[]){
     Fish shark=new Fish();
     shark.eat();

    }
}

class  Animal{
    String color;
    void eat(){
        System.out.println("Eat");
    }
    void breathe(){
        System.out.println("bresthes");
    }

}

//derived class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in watter");
    }
}
