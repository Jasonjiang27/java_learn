import java.util.*;

public class ListTest {
    //集合后面的<>代表泛型的意思
    //泛型是规定了集合元素的类型
    public List<Student> students;

    public ListTest(){
        this.students = new ArrayList<Student>();
    }
    //用于往students中添加学生
    public void testAdd(){
        Student st1 = new Student("1", "张三");
        students.add(st1);

        //取出List中的Student对象
        Student temp = students.get(0);
        System.out.println("添加了学生："+temp.id+":"+temp.name);

        Student st2 = new Student("2", "李四");
        students.add(0, st2);
        Student temp2 = students.get(0);
        System.out.println("添加了学生："+temp2.id+":"+temp2.name);

        //对象数组的形式添加
        Student[] student = {new Student("3", "王五"), new Student("4","马六")};

        students.addAll(Arrays.asList(student));
        Student temp3 = students.get(2);
        Student temp4 = students.get(3);
        System.out.println("添加了学生："+temp3.id+":"+temp3.name);
        System.out.println("添加了学生："+temp4.id+":"+temp4.name);
        Student[] student2 = {new Student("5","周七"), new Student("6","赵八")};
        students.addAll(2, Arrays.asList(student2));
        Student temp5 = students.get(2);
        Student temp6 = students.get(3);
        System.out.println("添加了学生："+temp5.id+":"+temp5.name);
        System.out.println("添加了学生："+temp6.id+":"+temp6.name);

    }

    public void testGet(){
        int size = students.size();
        for (int i=0;i < size; i++){
            Student st = students.get(i);
            System.out.println("学生："+st.id+":"+st.name);

        }
    }
    //迭代器遍历
    public void testIterator(){
        Iterator<Student> it = students.iterator();
        System.out.println("有如下学生：");
        while (it.hasNext()){
            Student st = it.next();
            System.out.println("学生"+st.id+":"+st.name);
        }
    }
    //通过for each 访问集合元素
    public void testForEach(){
        System.out.println("有如下学生");
        for (Student obj : students){
            Student st = obj;
            System.out.println("学生："+st.id+":"+st.name);
        }
        //使用java8 Stream将学生排序后输出
        students.stream().sorted(Comparator.comparing(x -> x.id)).forEach(System.out::println);//创建Stream

    }

    //修改List中的元素
    public void testModify(){
        students.set(4, new Student("3", "吴酒"));

    }
    //删除list中的元素
    public void testRemove(){
        Student st = students.get(4);
        System.out.println("我是学生："+st.id+":"+st.name+", 我即将呗删除");
        students.remove(st);
        System.out.println("成功删除学生！");
        testForEach();

    }

    public static void main(String[] args){
        ListTest lt = new ListTest();
        lt.testAdd();
        lt.testGet();
        lt.testIterator();
        lt.testModify();
        lt.testForEach();
        lt.testRemove();
    }
}