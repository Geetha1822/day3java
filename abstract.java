abstract class parent{
    abstract void loan();
    void printing(){
        System.out.println("welcome to rbi");
    }
}
class child extends parent{
    void loan(){
        System.out.println("Loan approved!!");
    }
}
class Main{
    public static void main(String[] args){
        child ch=new child();
        ch.loan();
        ch.printing();
    }
}