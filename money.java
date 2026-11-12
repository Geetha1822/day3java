abstract class bank{
    abstract void money();
    void balance(){
        System.out.println("balance from bank");
    }
}
class sbi extends bank{
    void money(){
        System.out.println("money implemented in sbi");
    }
}
class Main{
    public static void main(String[] args){
        sbi s=new sbi();
        s.money();
        s.balance();
    }
}