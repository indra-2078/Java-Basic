class Parent{
    Parent(){
        System.out.println("I am a constructor ");
    }
    Parent(int b){
        System.out.printf("I am a constructor with value of %d", b);
    }
}
class Child extends Parent{
    Child(int a, int b){
        super(a);
        System.out.printf("\ni am a child class with values %d and %d: ",a,b);
    }
}

public class constructors1_inheritance1 {
    public static void main(String[] args) {
        // Parent a = new Parent(23);
        Child a = new Child(33, 55);
    }
}
