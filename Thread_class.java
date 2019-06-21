public class Thread_class
{
    public static void main(String[] args) {
        A o1=new A();
        B o2=new B();
        o1.run();
        o2.run();
    }
}
class A extends Thread
{
public void run()
{
    
    for (int i = 0; i < 10; i++) {
      System.out.println("Thread B"+i);  
    }
}
}
class B extends Thread
{
public void run()
{

    for (int i = 0; i < 10; i++) {
      System.out.println("Thread A"+i);  
    }
}
}