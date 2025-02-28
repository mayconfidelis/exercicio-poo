public class Main {

    public static int restoDivisao(int a, int b) {
        return a % b;
    }
     {
        int resultado = restoDivisao(4, 5);
        System.out.println("Resto da divisão: " + resultado);


    public static double divisao (int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida!");
        }
        return (double) a / b;
    }
     {
        double resultado = divisao(10, 3);
        System.out.println("Resultado da divisão: " + resultado);

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