public class LamdbaTest {
    public static void main(String args[]){
        LamdbaTest tester = new LamdbaTest();

        //带有类型声明的表达式
        MathOperation addtion = (int a, int b) -> a + b;

        //没有类型声明的表达式
        MathOperation subtraction = (a, b) -> a - b;

        //带有大括号、带有返回语句的表达式
        MathOperation multiplication = (int a, int b) -> { return a * b;};
        //没有大括号和 return 语句的表达式
        MathOperation division = (int a, int b) -> a / b;

        //输出结果
        System.out.println("10 + 5 = "+tester.operate(10, 5, addtion));
        System.out.println("10 - 5 = "+ tester.operate(10, 5, subtraction));
        System.out.println(" 10 * 5 = "+tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 =" + tester.operate(10, 5, division));

        //没有括号的表达式
        GreetingService greetService1 = message -> System.out.println("Hello " + message);

        //有括号的表达式
        GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

        //调用sayMessage方法输出结果
        greetService1.sayMessage("shiyanlou");
        greetService2.sayMessage("classmate");
    }

    //下面定义一些接口和方法
    interface MathOperation {
        int operation(int a, int b);

    }
    interface GreetingService {
        void sayMessage(String message);
    }
    private int operate(int a, int b, MathOperation mathOpertion){
        return mathOpertion.operation(a, b);
    }
}