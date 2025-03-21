class Fruits {
    Fruits(){
        System.out.println("I am a default class");
    }  
    Fruits(String name){
        System.out.println("I am parameterrized constructor"+name);
    }
}

class Main {
    public static void main(String[] args) {
        Fruits f = new Fruits("Mango");
        // f.Fruits();
        // f.close(
    }
}
