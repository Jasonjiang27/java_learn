public class StringTest {
    public static void main(String[] args){
        String s = new String("Java");
        String m = "java";
        System.out.println("用equals()比较，java和Java结果为"+s.equals(m));
        System.out.println("用equalsIgnoreCase()比较，java和Java结果为"+s.equalsIgnoreCase(m));
        String sa = "abcdefabc";
        System.out.println("字符a第一次出现的位置为"+sa.indexOf('a'));
        System.out.println("字符串bc第一次出现的位置为"+sa.indexOf("bc"));
        System.out.println("字符a最后一次出现的位置为"+sa.lastIndexOf('a'));
        System.out.println("从位置3开始到结束的字符串"+sa.substring(3));
        System.out.println("从位置3到6之间的字符串"+sa.substring(3,6));

    }
}