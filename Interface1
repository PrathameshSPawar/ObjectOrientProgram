//Simple INTERFACE means inherits Multiple classes
public interface Engine {
    void start();
    void stop();
    void hp();
}

public interface Media {
    void start();
    void stop();
    void bass();
}

public interface Brakee {
    void dist();
    void wheel();
    void brake();
}

public class Car implements Engine,Brakee{
    @Override
    public void start()
    {
        System.out.println("Now Car is Start!!");
    }
    @Override
    public void stop()
    {
        System.out.println("Now car is Stop!!!");
    }
    @Override
    public void hp()
    {
        System.out.println("Car Is 1000 HorsePower");
    }
    @Override
    public void dist()
    {
        System.out.println("Car have 4X4 Dist brake");
    }
    @Override
    public void wheel()
    {
        System.out.println("Car have tubeLess wheel");
    }
    @Override
    public void brake()
    {
        System.out.println("Press the brakess!!!!");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        car.start();
        car.brake();
        car.dist();
        car.stop();
//Here problem is created when we call start then compliler get call 
//engine start cause here are two start one is engine nd other is 
//music so for overcome from this problem we use interface2
}
