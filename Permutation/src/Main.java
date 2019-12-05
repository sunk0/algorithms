public class Main {

    static String[] elements = {"A","B","C","D","E"};
    static String[] permutations = new String[elements.length];
    static boolean[] used = new boolean[elements.length];

    public static void main(String[] args) {

        Permutation(0);
    }

    private static void Permutation(int index) {
        if(index >= elements.length){
            System.out.println(String.join(" ",permutations));
        }
        else{
            for (int i = 0; i < elements.length; i++) {
                if(!used[i]){
                    var currentElement = elements[i];
                    used[i] = true;
                    permutations[index] = currentElement;
                    Permutation(index+1);
                    used[i] = false;
                }
            }
        }
    }
}
