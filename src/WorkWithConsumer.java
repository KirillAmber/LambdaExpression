import java.util.function.Consumer;

public class WorkWithConsumer {
    public static void main(String[] args) {
        HeavyBox heavyBox = new HeavyBox(5);
        Consumer<Integer> shipping = (n)-> System.out.println("Отгрузили ящик с весом " + n);
        Consumer<Integer>  sending = (n)-> System.out.println("Отправляем ящик с весом " + n);

        shipping.andThen(sending).accept(heavyBox.getWeight());
    }

}
class HeavyBox{
    private int weight;

    public int getWeight() {
        return weight;
    }

    public HeavyBox(int n){
        weight = n;
    }
}