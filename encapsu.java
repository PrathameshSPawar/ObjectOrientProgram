import java.util.*;
public class encapsu
{
    //protected make scope upto subClass of main class which is encapsu
    protected int num;
    String name;
    int arr[];
    
    public int getNum()
    {
        return num;
    }

    public void setNum(int num)
    {
        this.num=num;
        System.out.println(num);
    }

    public encapsu(int num,String name)
    {
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }
    public static void main(String[] args) {
        
    }
}