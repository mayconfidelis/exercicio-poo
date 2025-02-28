public class Main {
    public static int restoDivisao(int a, int b) {
        return a % b;
    }
    public static void main(String[] args) {
        int resultado = restoDivisao(4, 5);
        System.out.println("Resto da divisão: " + resultado);
    }
}