import java.util.Arrays;

public class Main {
    static String[] elements = {"A","B","C"};
    static boolean[] used = new boolean[elements.length];
    static String[] combinations = new String[elements.length-1];

    public static void main(String[] args) {

        Variations(0,0);
    }

    private static void Variations(int index,int start) {

          if(index >= elements.length-1){
             String[] distElements = Arrays.stream(combinations).distinct().toArray(String[]::new);
                  System.out.println(String.join(" ",combinations));
          }
          else{
              for (int i = start; i < elements.length ; i++) {
                  combinations[index] = elements[i];
                  Variations(index+1,i+1);
              }
          }
    }
}



