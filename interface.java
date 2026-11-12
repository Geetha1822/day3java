interface rbi{
    void amount();

}
class sbi implements rbi{
    public void amount(){
        System.out.println("amount is nill");
    }
}
class Main{
    public static void main(String[] args){
        sbi s=new sbi();
        s.amount();
    }
}