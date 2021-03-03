package 单例模式;

/**
 * @author jingliyuan
 * @date 2021/1/8
 * 单例模式的实现
 */
public class 懒汉式单例模式 {
    public static void main(String[] args) {
//        President president1 =  President.getInstance();
//        president1.getName();
//
//        President president2 =  President.getInstance();
//        president2.getName();

        President president3 = President.getInstance2();
        president3.getName();

        President president4 = President.getInstance2();
        president4.getName();

        if(president3.equals(president4)){
            System.out.println("他们是同一个人");
        }else{
            System.out.println("他们是不同的人");
        }

//        if(president1.equals(president2)){
//            System.out.println("他们是同一个人");
//        }else{
//            System.out.println("他们是不同的人");
//        }


    }
}
