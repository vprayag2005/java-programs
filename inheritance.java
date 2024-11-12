class employee {
    void display(){
        System.out.println(this.getClass().getSimpleName());
    }
    void cal_sal(){
        System.out.println("salary of employee is 10000");
    }
    
}
class engineer extends employee {
    void cal_sal(){
        super.cal_sal();
        System.out.println("salary of employee is 20000");
    }    
}
public class inheritance {
   public static void main(String[] args) {
    engineer e=new engineer();
    e.display();
    e.cal_sal();
   } 
}
