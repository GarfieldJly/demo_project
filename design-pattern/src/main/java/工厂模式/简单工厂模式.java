package 工厂模式;

/**
 * @author jingliyuan
 * @date 2021/1/9
 */
public  class 简单工厂模式 {
    //简单工厂模式
   public Product makeProduct(int flag){
       switch (flag){
           case 1:
               return new ConcreteProduct1();
           case 2:
               return new ConcreteProduct2();
       }
       return null;
    }

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.makeProduct(2).show();
    }
}
