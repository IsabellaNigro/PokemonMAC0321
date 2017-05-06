
public class Batalha {
	static int numdemortosA=0;
	static int numdemortosB=0;
	
	public static void listarPokemonsDoTreinadorA(Treinador A){
		//so listamos os pokemons de A se o treinador ainda tiver pokemons vivos
		if (A.getNumPokemons()>0) {
			// deixei a linha de baixo com comentario pq ta dando problema (tirando mais de uma vez os mortos)
			System.out.println("O treinador "+A.getNomeTreinador()+" possui "+(A.getNumPokemons()-numdemortosA)+" pokemóns!");
			System.out.print("Os pokemóns de "+A.getNomeTreinador()+" são: ");
			A.listaNomePokemon(A.getNumPokemons(), numdemortosA);  //AQUI TEM ERRO - matando pokemon
			System.out.println();
		}
		else System.out.println("O treinador "+A.getNomeTreinador()+" não tem pokemóns!!!");
	}
	
	public static void listarPokemonsDoTreinadorB(Treinador B){
		//so listamos os pokemons de B se o treinador ainda tiver pokemons vivos
		if (B.getNumPokemons()>0) {
			// deixei a linha de baixo com comentario pq ta dando problema (tirando mais de uma vez os mortos)
			System.out.println("O treinador "+B.getNomeTreinador()+" possui "+(B.getNumPokemons()-numdemortosB)+" pokemóns!");
			System.out.print("Os pokemóns de "+B.getNomeTreinador()+" são: ");
			B.listaNomePokemon(B.getNumPokemons(), numdemortosB); //AQUI TEM ERRO - matando pokemon
			System.out.println();
		}
		else System.out.println("O treinador "+B.getNomeTreinador()+" não tem pokemóns!!!");
	}
	// guardamos o numero de pokemons mortos de cada treinador para saber quando trocar ou terminar a batalha
	public static void numDePokemonsMortosDeA(){
		numdemortosA++;
	}
	
	public static void numDePokemonsMortosDeB(){
		numdemortosB++;
	}
	
	//o metodo imprime os pokemons escolhidos e seus HPs
	public static void escolhasDePokemons(Treinador A, Treinador B, Pokemon PA, Pokemon PB){
		System.out.println("O treinador "+A.getNomeTreinador()+" irá escolher seu pokemón!");
		System.out.println("O pokemón escolhido foi: "+PA.getNomePokemon()+" e seu HP é: "+PA.getHPPokemon());
		System.out.println();
		System.out.println("O treinador "+B.getNomeTreinador()+" irá escolher seu pokemón!");
		System.out.println("O pokemón escolhido foi: "+PB.getNomePokemon()+" e seu HP é: "+PB.getHPPokemon());
		System.out.println();
	}
	
	//metodo que sera chamado enquanto houver batalha 
	public static void batalha(Treinador A, Treinador B, Pokemon PA, Pokemon PB){
		System.out.println("O treinador "+A.getNomeTreinador()+" irá atacar com o pokemón "+PA.getNomePokemon()+"!");
		System.out.println("O treinador irá usar "+PA.imprimeAtaque(1));
		System.out.println();
		PA.pokemonAtaca(1, PB); 
		//dps de cada ataque devemos checar se o pokemon que recebeu o ataque nao morreu, se morreu devemos listar os pokemons tirando o morto
		vivoOuMorto(A, B, PA, PB);
		System.out.println();
		//CRIAR CHECAGEM DE CONDICAO PARA CONTINUAR A BATALHA DPS DOS ATAQUES
		if (PB.vivoOuMorto() == true){
			System.out.println("O treinador "+B.getNomeTreinador()+" irá atacar com o pokemón "+PB.getNomePokemon()+"!");
			System.out.println("O treinador irá usar "+PB.imprimeAtaque(1));
			System.out.println();
			PB.pokemonAtaca(1, PA);
			vivoOuMorto(A, B, PA, PB);
		}
		System.out.println();
	}
	
	public static void vivoOuMorto(Treinador A, Treinador B, Pokemon PA, Pokemon PB){
		if (PB.vivoOuMorto()==false) {
			numDePokemonsMortosDeB();
			listarPokemonsDoTreinadorB(B);
		}
		if (PA.vivoOuMorto()==false) {
			numDePokemonsMortosDeA();
			listarPokemonsDoTreinadorA(A);
		}
	}
	
	//metodo para iniciar batalha chamando o metodo batalha ate nao haver pokemons ou ate fuga
	public static void iniciarBatalha (Treinador A, Treinador B, Pokemon PA[], Pokemon PB[]) {
		System.out.println("A batalha Pokemón entre "+A.getNomeTreinador()+" e "+B.getNomeTreinador()+" irá começar!");
		System.out.println();
		listarPokemonsDoTreinadorA(A);
		listarPokemonsDoTreinadorB(B);
		int i=0, j=0, k=0;
		while (i<A.getNumPokemons() && j<B.getNumPokemons() && k<5) {
			if (PA[i].getHPPokemon()<0){
				// se o pokemon atual morreu vai pro proximo 
				i++; System.out.println("chegou1"+ i);
			}
				
			if (PB[j].getHPPokemon()<0){ // se o pokemon atual morreu vai pro proximo 
				j++; System.out.println("chegou2" +j);
			}	
			escolhasDePokemons(A, B, PA[i], PB[j]); //MUDAR O treinador Trash irá escolher seu pokemón!O pokemón escolhido foi: Raichu e seu HP é: 100
			batalha(A, B, PA[i], PB[j]);
			k++;
			//i++;
			//j++;
		}
		
		
	}

	public static void main(String[] args) {
		Pokemon[] PA = new Pokemon[6];
		Pokemon[] PB = new Pokemon[6];
		PA[0] = new Pikachu();
		PA[1] = new Bulbasaur();
		PA[2] = null;
		PA[3] = null;
		PA[4] = null;
		PA[5] = null;
		PB[0] = new Raichu();
		PB[1] = new Onix();
		PB[2] = new Pikachu();
		PB[3] = new Bulbasaur();
		PB[4] = new Graveler();
		PB[5] = null;

		
		Ash T1 = new Ash ();
		Trash T2 = new Trash ();
		/*
		Pikachu P1 = new Pikachu ();
		Bulbasaur P2 = new Bulbasaur();
		Charmander P3 = new Charmander();
		Onix P4 = new Onix ();
		Graveler P5 = new Graveler(); 
		*/
		
		
		iniciarBatalha (T1, T2, PA, PB);
		//TESTAR HEAL 
		
	}
}
