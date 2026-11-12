abstract class animal{
    abstract void sound();
    abstract void behaviour();
    void color(){
        System.out.println("color of animal is white");
    }
}
class dog extends animal{
    dog(){
        System.out.println("dog constructor called");
    }
    void sound(){
        System.out.println("dog barks");
    }
    void behaviour(){
        System.out.println("dog is loyal");

    }
    void color(){
        System.out.println("color of dog is black");
    }

}
class Main{
    public static void main(String[] args){
        dog d=new dog();
        d.sound();
        d.behaviour();
        d.color();
    }
}