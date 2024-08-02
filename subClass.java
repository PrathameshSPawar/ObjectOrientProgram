import java.util.*;
public class subClass extends encapsu {
    public subClass(int num,String name)
    {
        super(num, name);
    }
    public static void main(String[] args) {
        encapsu obj=new encapsu(45,"Rohit");
        int n=obj.num;
        System.out.println(n);
    }
}
