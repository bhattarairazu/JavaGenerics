package Generics1;

public class Generics1Test<T> {
 	T obj;
    Generics1Test(T obj){
 		this.obj = obj;
 	}

 	public void show(){
 		System.out.println("This is generics class of type : "+obj.getClass().getName());
 	}

 	public T getObj(){
 		return this.obj;
 	}
 }




 class Main
 {
     public static void main (String[] args)
     {
         Generics1Test<String> g1 = new Generics1Test<String>("razu");
 		g1.show();
 		g1.getObj();

         Generics1Test<Double> g2 = new Generics1Test<Double>(23.22323);
 		g2.show();
 		g2.getObj();

         Generics1Test<Integer> g3 = new Generics1Test<Integer>(3333);
 		g3.show();
 		g3.getObj();
     }
 }




