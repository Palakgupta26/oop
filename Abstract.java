// abstract class Animal{
//     public void walk(){
//         System.out.println("animal is walking");
//     }
//     abstract public void sound();
// }

interface  Animal{                    // can not have constructor, allows multiple inheritance 
    public void walk();               // by default public and abstract, no need to define method
}

class cat implements Animal{           // implements animal, mamal
    public void walk(){
        System.out.println("cat is walking");
    }
}

// class cat extends Animal{
//     // public void walk(){
//     //     System.out.println("cat is walking");
//     // }

//     //if the method in abstract class is abstract then it is mandatory to define it in the child class . if it is not abstract then no error
//     public void sound(){
//         System.out.println("cat meows");
//     }
// }

class Student{
    static String school; 
}

public class Abstract {
    public static void main(String[] args) {      // static - common for all objects
        cat c = new cat();
        // Animal a = new Animal();              only a thought
        c.walk();

        Student.school = "abc";
        Student s1 = new Student();
        System.out.println(s1.school);
    }
}
