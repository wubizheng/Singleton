package singleton;

public class LazyDoubleCheckSimpleton {

    private  static LazyDoubleCheckSimpleton doubleCheck=null;
    public final static  LazyDoubleCheckSimpleton getInstance(){
        if(doubleCheck==null){
            synchronized(LazyDoubleCheckSimpleton.class){
                if(doubleCheck==null)
                    doubleCheck=new LazyDoubleCheckSimpleton();
            }
        }
        return doubleCheck;
    }
}
