package Generics1;

class Gmethod {

    public <T> void getGenerics(T add){
        System.out.println("This is generics"+add);
    }

    public <T> void addGenerics(T add,T add2){
        System.out.println("Adding generics types "+add + add2);
    }
}

public class GenericsMethod{
    public static void main(String[] args){
        Gmethod gmethod = new Gmethod();
        gmethod.getGenerics(232);
        gmethod.getGenerics("HelloWorld");

        //adding either string or number
        gmethod.addGenerics(1,2);
        gmethod.addGenerics("String"," String2");
        gmethod.addGenerics(121.1221,1212.1212);
        gmethod.addGenerics(1212.1212,1212.1212);
        gmethod.addGenerics('G','D');
    }
}
