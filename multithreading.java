import java.util.Random;

class x implements Runnable{
    static int random;
    Random rand = new Random();
    @Override
    public void run(){
        random =rand.nextInt(10);
        System.out.println(random);
    }
}
class y implements Runnable{
    @Override
    public void run(){
        if(x.random % 2 ==0){
            System.out.println((int)Math.pow(x.random,2));
        }
    }    
}
class z implements Runnable{
    @Override
    public void run(){
        if(x.random % 2 !=0){
            System.out.println((int)Math.pow(x.random,3));
        }
    }      
}
public class multithreading {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            try {
                Thread obj1=new Thread(new x());
                Thread obj2=new Thread(new y());
                Thread obj3=new Thread(new z());
                obj1.start();
                obj2.start();
                obj3.start();
                Thread.sleep(6000);
            } catch (Exception e) {
                // TODO: handle exception
            }

        }
    }
}
