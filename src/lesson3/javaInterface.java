package lesson3;

// The synthax of declaring an interface

/*interface <interface_name>{

    // declare constant fields
    // declare methods that abstract
    // by default.
}*/

public interface javaInterface {

    int min = 5;
    void print();
}

class A6 implements javaInterface{
    public void print(){
        System.out.println("Hello");
    }

    public static void main(String args[]){
        A6 obj = new A6();
        obj.print();
    }
}
