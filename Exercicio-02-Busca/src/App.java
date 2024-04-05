public class App {
    public static void main(String[] args) throws Exception {

        Pessoa Vinicius = new Pessoa("Vinícius", 41);
        Pessoa Daniela = new Pessoa("Daniela", 44);
        Pessoa Ana = new Pessoa("Ana", 18);
        Pessoa Carla = new Pessoa("Carla", 20);
        Pessoa Daniel = new Pessoa("Daniel Paiva", 31);
        Pessoa Felipe = new Pessoa("Felipe", 24);
        Pessoa Patricia = new Pessoa("Patricia", 23);
        Pessoa Rafael = new Pessoa("Rafael", 20);
        Pessoa Pedro = new Pessoa("Pedro", 22);
        Pessoa Marcela = new Pessoa("Marcela", 24);
        Pessoa Amanda = new Pessoa("Amanda", 100);
       
        Pessoa[] listaPessoas = { Vinicius, Daniela, Ana, Carla,
        Daniel, Felipe, Pedro, Patricia, Rafael, Marcela, Amanda };
        
        //BUSCANDO IDADE IGUAL A 100
        int primeiraBusca = 100;    
        int segundaBusca = 30;

        String nome = Encontrar.busca(listaPessoas, primeiraBusca);
        String nomes = Encontrar.busca2(listaPessoas, segundaBusca);
        int idade = 18;
        
        if(nome != null){
            System.out.println("Nomes encontrados com idade igual a " + primeiraBusca + ":");
            for(Pessoa pessoa : listaPessoas){
                if(pessoa.getIdade() == primeiraBusca){
                    System.out.println(pessoa.getNome()+ "\n");
                }
            }    
        if(nomes != null){
            System.out.println("Pessoas acima de 30 anos:");
            for (Pessoa pessoa : listaPessoas) {
                if(pessoa.getIdade() >= segundaBusca){
                    System.out.println(pessoa.getNome());        
                }      
            }
            System.out.println("\n");
        }    
    }
    for(Pessoa pessoa : listaPessoas){
        pessoa.setIdade(idade);
        System.out.println(pessoa.getNome() + " teve a idade atualizada para: " + pessoa.getIdade() + " anos");
    }
}
}

