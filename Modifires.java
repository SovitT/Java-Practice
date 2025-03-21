// package myjava;
public class Modi {
    public int a = 100;
    protected int b=200;
    int c = 300;
    private String name = "Sovit Thakre";
    
}
public class Modifires{
    public int a = 10;
    protected int b=20;
    int c = 30;
    private String name = "Sovit";
    public static void main(String[] args) {
        Modifires m = new Modifires();
        System.out.println("A : "+m.a);
        System.out.println("B : "+m.b);
        System.out.println("C : "+m.c);
        System.out.println("My name is : "+m.name);

        Modi m1 =new Modi();
        System.out.println("A : "+m1.a);
        System.out.println("B : "+m1.b);
        System.out.println("C : "+m1.c);
        System.out.println("My name is : "+m1.name);
    }
}