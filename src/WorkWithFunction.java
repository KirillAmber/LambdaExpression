import java.util.function.Function;

public class WorkWithFunction {
    public static void main(String[] args) {
        Function<Integer, String> kindaNumber = (n)->{
            if(n < 0){
                return "Отрицательное число";
            }
            if(n>0){
                return "Положительное число";
            }
                return "Ноль";
        };
        System.out.println(kindaNumber.apply(10));
        System.out.println(kindaNumber.apply(0));
        System.out.println(kindaNumber.apply(-6));

    }
}
