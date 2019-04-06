import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
    public List<Student> students;
    public SetTest() {
        students = new ArrayList<Student>();
    }

    public void testAdd(){
        //创建一个学生对象，并通过调用add 方法，添加到学生管理LIst中
        Student st1 = new Student("1", "张三");
        students.add(st1);

        Student st2 = new Student("2", "李四");
        students.add(st2);
        Student[] student = {new Student("3","王五"),new Student("4","马六")};
        students.addAll(Arrays.asList(student));

        Student[] student2 = {new Student("5","周七"),new Student("6","赵八")};
        students.addAll(Arrays.asList(student2));
    }

    public void testForEach(){
        System.out.println("有如下学生：");
        for (Object obj:students){
            Student st = (Student)obj;
            System.out.println("学生："+st.id+":"+st.name);

        }
    }
    public static void main(String[] args){
        SetTest st = new SetTest();
        st.testAdd();
        st.testForEach();
        PD pd = new PD("1","张老师");
        System.out.println("请："+pd.name+"选择小组成员！");
        //创建一个Scanner 对象
        Scanner console = new Scanner(System.in);

        for (int i=0;i<3; i++){
            System.out.println("请输入学生ID");
            String studentID = console.next();
            for (Student s:st.students){
                if (s.id.equals(studentID)){
                    pd.students.add(s);
                }
            }
        }
        st.testForEachForSer(pd);
        //关闭Scanner对象
        console.close();
    }

    public void testForEachForSer(PD pd){
        for (Student s:pd.students){
            System.out.println("选择了学生："+s.id+":"+s.name);

        }
    }
}