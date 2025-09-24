class Pen{
    //data
    String color;
    String type;

    //members
    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color); // this tell this function which object calls this function
    }
}

class Teacher {
    String name;
    int age;

    public void info(){
        System.out.println(this.name + " : "+ this.age);
    }
    public void info(String name){
        System.out.println(name);
    }
    
    Teacher(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println( "constructor : "+this.name);
    }
    Teacher(){

    }
    Teacher(Teacher t){
        this.name = t.name;
        this.age = t.age;
    }
}

public class OOPs {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.write();
       
        // Teacher t1 =new Teacher();
        // t1.name = "meenal";
        // t1.age = 22;
        // t1.info("palak");
        // t1.info();
        Teacher t2 = new Teacher("palak",22);
        t2.info();
        Teacher t3 = new Teacher(t2);
        t3.name =  "new name";
        t3.info();
    }
}