// extends
class shape{
    public void display(){
        System.out.println("displaying shape");
    }
}

class circle extends shape{
    public void display(){
        System.out.println("circle");
    }
}

class square extends shape{
    public void display(){
        System.out.println("square");
    }
}


public class inheritance {
    public static void main(String[] args) {
        circle c= new circle();
        c.display();
        shape s = new shape();
        s.display();
        square sq = new square();
        sq.display();
        s.display();
    }
}
