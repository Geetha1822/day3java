class rbi{
    void loan(){
        System.out.println("loan from rbi");
    }
}
class sbi extends rbi{
    
}
class hdfc extends rbi{

}
class Main{
   public static void main(String[] args){
        hdfc h=new hdfc();
        h.loan();
    }
}