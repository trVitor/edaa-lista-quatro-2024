package exercicio.pkg01.busca;
import java.util.ArrayList;


public class BuscaSequencial {
  
    public static ArrayList<Integer>buscaIndice(int[] lista, int chave){
        ArrayList<Integer> indiceEncontrados = new ArrayList<>();
        for(int i = 0; i < lista.length; i++){
            if(lista[i] == chave){
                indiceEncontrados.add(i);
            }
        }
        return indiceEncontrados;
    }
    
}

 
    

