class A extends Thread{
    public void run(){
        for(int i = 0;i< 5;i++){
            System.out.println("HELLO");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0;i< 5;i++){
            System.out.println("hey");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Multithreading {
    public static void main(String args[]){
        A obj1 = new A();
        B obj2 = new B();
        

        obj1.start();
        try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        obj2.start();
    }
}
