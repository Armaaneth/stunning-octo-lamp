package lesson2;

//Encapsulation
public class Lesson2 {
    public static void main(String[] args) {
        Wrapper wrap = new Wrapper();
        wrap.SetName("Tomiwa");
        System.out.println(wrap.GetName());

        wrap.SetAge(12);
        System.out.println(wrap.GetAge());

    }
}
