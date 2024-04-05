
public class Encontrar {

    public Encontrar(){

    }
// METODO BUSCA IDADE = 100
    public static String busca(Pessoa[] pessoas, int idade){
        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i].getIdade() == idade){
            return pessoas[i].getNome();
        }
    }
    return null;
}
// METODO BUSCA IDADE > 30
public static String busca2(Pessoa[] pessoas, int idade){
        for(int i = 0; i < pessoas.length; i++ ){
            if(pessoas[i].getIdade() > idade){
                return pessoas[i].getNome();
            }
        }
        return null;
    }

// METODO ALTERAR IDADE PARA 18     

}

