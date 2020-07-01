public class Print {
    public static void main(String[] args) {
        Printable print = System.out::println;
        print.print(5);
    }
}
