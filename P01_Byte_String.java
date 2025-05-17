public class P01_Byte_String {
    public static void main(String[] args) {
        byte x = 11;
        String str = Byte.toString(x);
        System.out.println(x);
        System.out.println(str.getClass().getName());
    }
}
