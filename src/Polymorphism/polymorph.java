package Polymorphism;
class Bird{
    public void sing(){
        System.out.println("Tweet Tweet Tweet");
    }
}

class Owl extends Bird {
    public void sing(){
        System.out.println("Cra Cra Cra");
    }
}

class WoodPecker extends Bird {
    public void sing(){
        System.out.println("Cokcokrookoo");
    }
}

public class polymorph {

    public static void main(String[] args) {
        Owl b = new Owl();
        b.sing();

        WoodPecker wp = new WoodPecker();
        wp.sing();
    }
}
