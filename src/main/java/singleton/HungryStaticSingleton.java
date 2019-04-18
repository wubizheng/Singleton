package singleton;

public class HungryStaticSingleton {
    private  static HungryStaticSingleton hungryStaticSingleton=null;
    static {
        hungryStaticSingleton=new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){}

    public static HungryStaticSingleton getInstance(){
        return hungryStaticSingleton;
    }
}
