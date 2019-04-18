package singleton;

public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){
        if(LazyHolder.lazy!=null){
            throw new RuntimeException("只能一个实例");
        }
    }
    public static final LazyInnerClassSingleton getInstance(){
         return LazyHolder.lazy;
    }
    private static class LazyHolder{
        private static final LazyInnerClassSingleton lazy=new LazyInnerClassSingleton();
    }
}
