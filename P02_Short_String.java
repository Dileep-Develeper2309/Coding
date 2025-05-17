public class P02_Short_String {
    public static void main(String[] args) {
        short num = 234;

        String str = Short.toString(num);
        System.out.println(str);
        System.out.println(str.getClass().getName());
    }
}
