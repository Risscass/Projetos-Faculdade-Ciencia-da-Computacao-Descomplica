public class Vetores {
    public static void main (String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Alice", "Bob", "Charlie"};

        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        String[] nomes = new String[3];

        System.out.println("Vetores de numeros inicializada: "+ numbers);
        System.out.println("Vetores de numeros manualmente: "+ numeros);

        System.out.println("Valores do vetor usando FOR");
        for (int i=0; i<numbers.length; i++){
            System.out.println("Elementos na posição [" + i + "]:" + numbers[i]);
        }
    }
}
