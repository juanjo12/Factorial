public class Factorial {
    public static void main(String[] args) {
        System.out.println(numero(10));
    }
    public static int numero(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}