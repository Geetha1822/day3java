class rbi{
    void loan(){
        System.out.println("loan from rbi");
    }
}
class sbi extends rbi{
    sbi(){
        System.out.println("this is sbi");
    }
}
class hdfc extends rbi{
    hdfc(){
        System.out.println("this is hdfc");
    }
}
class Main{
    public static void main(String[] args){
        sbi s=new sbi();
        s.loan();
        hdfc h=new hdfc();
        h.loan();
    }
}