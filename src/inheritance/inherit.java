package inheritance;



public class inherit {
    public static void main(String[] args) {
        Mouse1 m1 = new Mouse1();
        Mouse2 m2 = new Mouse2();
        Mouse3 m3 = new Mouse3();



        m1.rightClick();
        m2.leftClick();
        m3.scrollUp();
        m1.scrollDown();

        m1.detectGesture();
        m2.remoteAccess(2);
        m3.polyColor("blue");

    }
}
