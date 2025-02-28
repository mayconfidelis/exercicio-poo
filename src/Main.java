public class Main {
    public static boolean ehPar(int numero){
        return numero % 2 == 0;
    }
    public static void main(String[] args) {
        boolean resultado = ehPar(5);
        System.out.println("O número é par? " + resultado);
    }
}