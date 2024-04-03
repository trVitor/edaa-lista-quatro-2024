package exercicio.pkg01.busca;
import java.util.*;

public class Exercicio01Busca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
       int[] listaNumeros = { 40, 63, 40, 36, 10, 89, 74,
        32, 59, 13, 29, 12, 40, 8, 11, 63, 1, 52,
        25, 92, 42, 76, 33, 2, 72, 15, 92, 65, 3, 19,
        33, 21, 57, 19, 55, 93, 31, 54, 31, 50,
        66, 44, 54, 55, 29, 75, 43, 88, 61, 65,
        49, 87, 10, 25, 33, 70, 84, 125, 345, 400,
        77, 32, 41, 66, 33, 70, 84, 125, 600,
        38, 43, 51, 34, 76, 25, 48, 14, 50, 71,
        1, 98, 86, 38, 91, 65, 96, 60, 43, 75,
        86, 59, 17, 86, 12, 10, 16, 10, 33, 15,
        77, 22, 56, 4, 9, 63, 49, 80, 39, 53,
        97, 36, 34, 16, 1, 98, 78, 92, 100, 35 
       };
       
       BuscaSequencial busca = new BuscaSequencial();
        
       System.out.println("Digite o números que você procurar: ");
       String procura = scanner.nextLine();
       String[] num = procura.split(",");
       
       
       for( String valor : num ) {
           int numProcurado = Integer.parseInt(valor);
           ArrayList<Integer> resultado = BuscaSequencial.buscaIndice(listaNumeros, numProcurado);
       
           if(!resultado.isEmpty()){
             System.out.println("O valor " + numProcurado + " foi encontrado no indice: " + resultado);
            } else{
             System.out.println("O valor " + numProcurado + " não foi encontrado na lista");
            }
       scanner.close();
    }
}
}
