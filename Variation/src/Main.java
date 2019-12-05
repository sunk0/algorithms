public class Main {
    static String[] elements = {"A","B","C","D","E"};
    static boolean[] used = new boolean[elements.length];
    static String[] variations = new String[elements.length-1];

    public static void main(String[] args) {
        Variations(0);
    }

    private static void Variations(int index) {
        if(index >= variations.length){
            System.out.println(String.join(" ",variations));
        }
        else{
            for (int i = 0; i < elements.length; i++) {
                if(!used[i]){
                    var current = elements[i];
                  used[i]= true;
                  variations[index] = current;
                  Variations(index+1);
                  used[i] = false;
                }
            }
        }
    }
}
