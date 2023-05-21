public class ArraysIntro {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i : nums) {
            System.out.println(i);

        }
        System.out.println("\n");
        int contador = 0;
        String nombres[] = { "Jose", "Martin", "Gabriel", "Fernando" };
        for (String nombre : nombres) {
            System.out.println(contador + " " + nombre);
            contador++;
        }
    }
}
