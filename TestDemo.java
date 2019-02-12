/*
使用T代表类型，无论何时都没有比这更具体的类型来区分它，如果有多个类型参数，我们可能使用字母表中T的临近字母，比如S.
*/
class Test<T> {
    private T ob;
    //构造函数
    public Test(T ob){
        this.ob = ob;
    }
    //getter 方法
    public T getOb() {
        return ob;
    }
    //setter 方法
    public void setOb(T ob) {
        this.ob = ob;
    }
    public void showType() {
        System.out.println("T的实际类型是："+ob.getClass().getName());
    }
}

public class TestDemo {
    public static void main(String[] args) {
        //定义泛型类 Test 的一个Integer版本
        Test<Integer>intOb = new Test<Integer>(88);
        intOb.showType();
        int i = intOb.getOb();
        System.out.println("value= "+i);
        System.out.println("-----------------------------");
        Test<String> strOb = new Test<String>("Hello Gen!");
        strOb.showType();
        String s = strOb.getOb();
        System.out.println("value= "+s);
    }
}