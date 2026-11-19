public class OperadoresTernarios {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        int Maior = (a > b)? a : b;
        int Menor = (b < a)? b : a;

        System.out.println("O maior valor entre 10 e 20 e: " + Maior);
        System.out.println("O menor valor entre 10 e 20 e: " + Menor);
    }
}
