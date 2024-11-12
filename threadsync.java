class table{
    synchronized void calc(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i +"*" +n +"=" +i*n);
            try {
                Thread.sleep(9000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class thread1 extends Thread{
    table t;
    thread1(table t){
        this.t=t;
    }
    public void run(){
        t.calc(5);
    }
}
class thread2 extends Thread{
    table t;
    thread2(table t){
        this.t=t;
    }
    public void run(){
        t.calc(2);
    }
}
public class threadsync {
    public static void main(String[] args) {
        table t =new table();
        thread1 t1 = new thread1(t);
        thread2 t2 = new thread2(t);
        t1.start();
        t2.start();
    }
}