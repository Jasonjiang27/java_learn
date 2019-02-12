public class Test {
    public<T,S extends T> T testDemo(T t, S s){
        System.out.println("我是T类型，我的类型是"+t.getClass().getName());
        System.out.println("我是S类型，我的类型是"+s.getClass().getName());
        return t;
    }
    public static void main(String[] args) {
        Test test = new Test();
        Dog d = new Dog();
        Animal a0 = new Animal();
        Animal a1 = test.testDemo(a0, d);
        System.out.println("我是整数 a,我的类型是"+a1.getClass().getName());
    }
}