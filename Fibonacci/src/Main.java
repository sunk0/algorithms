import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer index = Integer.parseInt(scanner.nextLine());
        Fibonacci(index);
    }
    static void Fibonacci (Integer index){
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(1L);
        Long sum ;
        for (int i = 2; i < index; i++) {
            sum =+ list.get(i-1) + list.get(i-2);
            list.add(i,sum);
        }
         System.out.println(stringBuilder.append(list));
    }
}
