package lesson2;

public class Wrapper {
    private String name;
    private  int age;

    public void SetName(String newName){
        name = newName;
    }
    public String GetName(){
        return name;
    }

    public void SetAge(int newAge){
        age = newAge;
    }

    public int GetAge(){
        return age;
    }
}
