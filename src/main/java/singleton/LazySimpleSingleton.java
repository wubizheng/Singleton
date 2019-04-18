package singleton;

public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySimpleSingleton=null;
    private LazySimpleSingleton(){}

//    public static LazySimpleSingleton getInstance(){
//        if(lazySimpleSingleton==null){
//            lazySimpleSingleton=new LazySimpleSingleton();
//        }
//        return lazySimpleSingleton;
//    }

    public final static synchronized LazySimpleSingleton getInstance(){
        if(lazySimpleSingleton==null){
            lazySimpleSingleton=new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }


}
