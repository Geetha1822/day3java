class rbi{
    void name(){
        System.out.println("this is rbi");
    }
}
class sbi extends rbi{
    sbi(){
        System.out.println("this is sbi");
    }
}
class Main{
    public static void main(String[] args){
        sbi s=new sbi();
        s.name();
    }
    
}