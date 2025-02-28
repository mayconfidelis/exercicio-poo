public class Main {
    public static double divisao (int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return (double) a / b;
    }
    public static void main(String[] args) {
        double resultado = divisao(10, 3);
        System.out.println("Resultado da divisão: " + resultado);
    }
}