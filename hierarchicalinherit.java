class parent{
    void name(){
        System.out.println("this is parent");
    }
}
class child1 extends parent{
    child1(){
        System.out.println("this is child1");
    }
}
class child2 extends parent{
    child2(){
        System.out.println("this is child2");
    }
}
class Main{
    public static void main(String[] args){
        child1 ch1=new child1();
        ch1.name();
        child2 ch2=new child2();
        ch2.name();
    }
}