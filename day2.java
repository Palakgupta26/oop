class Student{
    int rno;
    String name;

    Student(){
        rno = 1;
        name = "palak";
    }
    Student(int rnol, String name){
        rno = rnol;
        this.name = name;
    }
}

public class day2 {
    public static void main(String[] args) {
        final Student s1 = new Student();
        // System.out.println(s1.rno);
        Student s2 = new Student(13, "meenal");
        // s1 = s2;
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s2.rno);
        System.out.println(s2.name);
    }
}