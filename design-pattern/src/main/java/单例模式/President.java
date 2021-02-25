package 单例模式;

/**
 * @author jingliyuan
 * @date 2021/1/8
 * 单例模式的demo
 */
public class President {
    private static volatile President president;

    private President(){
        System.out.println("产生一个总统");
    }

    public static synchronized President getInstance(){
        if(president == null){
            president = new President();
        }else{
            System.out.println("总统只能有一个，已经存在");
        }
        return president;
    }

    public static President getInstance2(){
        if(president == null){
            synchronized (President.class){
                if(president == null){
                    president = new President();
                }else{
                    System.out.println("总统只能有一个，已经存在");
                }
            }
        }
        return president;
    }

    public static President getPresident() {
        return president;
    }

    public static void setPresident(President president) {
        President.president = president;
    }

    public void getName() {
        System.out.println("我是总统：加菲猫");
    }

}
