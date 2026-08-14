package track.M02.Constructor;

public class student {
    String name;
    int age;
    double height;
    public student(String name,int age,double height)
    {
        this.name=name;
        this.age=age;
        this.height=height;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
