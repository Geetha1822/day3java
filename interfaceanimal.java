interface animal{
    void sound();
}
class dog implements animal{
    public void sound(){
        System.out.println("dog barks - bow bow");
    }
}
class Main{
    public static void main(String[] args){
        animal a=new dog();
        a.sound();
    }
}