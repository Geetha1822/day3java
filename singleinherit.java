class parent{
    void name(){
        System.out.println("This is parent");
    }
}
class child extends parent{
    child(){
        System.out.println("This is child");
}   }
class Main{
    public static void main(String[] args){
        parent p=new parent();
        p.name();
    }
}