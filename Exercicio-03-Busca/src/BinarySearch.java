public class BinarySearch {

    int[] listaNumeros;

    public static int busca(int[] listaNumeros, int numeroBuscado){
        return buscaBinaria(listaNumeros, numeroBuscado, 0, listaNumeros.length - 1);
    }

    private static int buscaBinaria(int[] listaNumeros, int numeroBuscado, int inicio, int fim){
        if(inicio <= fim){
        int meio = (inicio + fim)/2;
        if(listaNumeros[meio] == numeroBuscado){
            return meio;
        }else if(listaNumeros[meio] < numeroBuscado){
            return(buscaBinaria(listaNumeros, numeroBuscado, meio + 1, fim));
        }else{
            return(buscaBinaria(listaNumeros, numeroBuscado, inicio, meio -1));
        }
    }
    return - 1;
}
}
