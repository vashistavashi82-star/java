 public class MultiplesOfTwo {
    public static void main(String[] args) {
        int[] multiples = new int[100];
        for (int i = 1; i < multiples.length; i++) {
            multiples[i-1] = 3 * i;  
        }
   
        for (int i = 0; i < multiples.length; i++) {
            System.out.print(multiples[i] + " ");
        }
    }
}