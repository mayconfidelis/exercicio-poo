public class Main {

    public static int multiplicacao(int a, int b) {
        return a * b;
    } 
    public static int subtracao (int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        int resultado = multiplicacao(3, 4);
        System.out.println("Resultado da multiplicação: " + resultado);

        int resultado = subtracao (1, 2);
        System.out.println("O resultado da subtração é: " + resultado);
    }
}