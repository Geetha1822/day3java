class grandparent{
    void name(){
        System.out.println("this is grand parent");
    }
}
class parent extends grandparent{
    parent(){
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
        child ch=new child();
        ch.name();
    }
}