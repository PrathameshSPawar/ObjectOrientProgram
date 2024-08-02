//INTERFACE 2
public class DieselEngine implements Engine {
    @Override
    public void start()
    {
        System.out.println("Cars Diesel Engine is starts");
    }
    @Override
    public void stop()
    {
        System.out.println("Cars Diesel Engine is Off");
    }
    @Override
    public void hp()
    {
        System.out.println("Car is 800 HorsePower");
    }
}

public class ElectricEngine implements Engine {
    @Override
    public void start()
    {
        System.out.println("Cars Electric Engine is starts");
    }
    @Override
    public void stop()
    {
        System.out.println("Cars Electric Engine is Off");
    }
    @Override
    public void hp()
    {
        System.out.println("Car is 1100 HorsePower");
    }
}

public class MonsterCar
{
    private Engine engine;
    private Media player=new CDplayer();
    public MonsterCar()
    {
        engine=new DieselEngine();
    }
    public MonsterCar(Engine engine)
    {
        this.engine=engine;
    }
    public void start()
    {
        engine.start();
    }
    public void stop()
    {
        engine.stop();
    }
    public void startMu()
    {
        player.start();
    }
    public void stopMu()
    {
        player.stop();
    }
    public void upgradEngi(Engine engine)
    {
        this.engine=engine;
    }
}

public class Main {
    public static void main(String[] args) {
        //Car car=new Car();
        //car.start();
        //car.brake();
        //car.dist();
        //car.stop();
        MonsterCar car=new MonsterCar();
        car.start();
        car.startMu();
    }
}


