
public class Batalha {
	static int numdemortosA=0;
	static int numdemortosB=0;
	public static void listarPokemonsDoTreinadorA(Treinador A, Pokemon PA){
		//so listamos os pokemons de A se o treinador ainda tiver pokemons vivos
		if (A.getNumPokemons()>0) {
			System.out.println("O treinador "+A.getNomeTreinador()+" possui "+A.getNumPokemons()+" pokemóns!");
			System.out.print("Os pokemóns de "+A.getNomeTreinador()+" são: ");
			A.listaNomePokemon(A.getNumPokemons(), numdemortosA);
		}
		else System.out.println("O treinador "+A.getNomeTreinador()+" não tem pokemóns!!!");
	}
	
	public static void listarPokemonsDoTreinadorB(Treinador B, Pokemon PB){
		//so listamos os pokemons de B se o treinador ainda tiver pokemons vivos
		if (B.getNumPokemons()>0) {
			System.out.println("O treinador "+B.getNomeTreinador()+" possui "+B.getNumPokemons()+" pokemóns!");
			System.out.print("Os pokemóns de "+B.getNomeTreinador()+" são: ");
			B.listaNomePokemon(B.getNumPokemons(), numdemortosB);
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
		System.out.println("O pokemón escolhido foi: "+A.getNomePokemon(0)+" e seu HP é: "+A.getHP(PA));
		System.out.println("O treinador "+B.getNomeTreinador()+" irá escolher seu pokemón!");
		System.out.println("O pokemón escolhido foi: "+B.getNomePokemon(0)+" e seu HP é: "+B.getHP(PB));
	}
	
	//metodo que sera chamado enquanto houver batalha 
	public static void batalha(Treinador A, Treinador B, Pokemon PA, Pokemon PB){
		System.out.println("O treinador "+A.getNomeTreinador()+" irá atacar com o pokemón "+A.getNomePokemon(0)+"!");
		System.out.println("O treinador irá usar "+PA.imprimeAtaque(1));
		PA.pokemonAtaca(1, PB);
		//dps de cada ataque devemos checar se o pokemon que recebeu o ataque nao morreu, se morreu devemos listar os pokemons tirando o morto
		vivoOuMorto(A, B, PA, PB); 
		//CRIAR CHECAGEM DE CONDICAO PARA CONTINUAR A BATALHA DPS DOS ATAQUES 
		System.out.println("O treinador "+B.getNomeTreinador()+" irá atacar com o pokemón "+B.getNomePokemon(0)+"!");
		System.out.println("O treinador irá usar "+PB.imprimeAtaque(1));
		PB.pokemonAtaca(1, PA);
		vivoOuMorto(A, B, PA, PB);
	}
	
	public static void vivoOuMorto(Treinador A, Treinador B, Pokemon PA, Pokemon PB){
		if (PB.vivoOuMorto()==false) {
			numDePokemonsMortosDeB();
			listarPokemonsDoTreinadorB(B, PB);
		}
		if (PA.vivoOuMorto()==false) {
			numDePokemonsMortosDeA();
			listarPokemonsDoTreinadorA(A, PA);
		}
	}
	
	//metodo para iniciar batalha chamando o metodo batalha ate nao haver pokemons ou ate fuga
	public static void iniciarBatalha (Treinador A, Treinador B, Pokemon PA, Pokemon PB) {
		System.out.println("A batalha Pokemón entre "+A.getNomeTreinador()+" e "+B.getNomeTreinador()+" irá começar!");
		listarPokemonsDoTreinadorA(A, PA);
		listarPokemonsDoTreinadorB(B, PB);
		escolhasDePokemons(A, B, PA, PB);
		batalha(A, B, PA, PB);
		
	}

	public static void main(String[] args) {
		Ash T1 = new Ash ();
		Trash T2 = new Trash ();
		Pikachu P1 = new Pikachu ();
		Bulbasaur P2 = new Bulbasaur();
		Charmander P3 = new Charmander();
		Onix P4 = new Onix ();
		Graveler P5 = new Graveler(); 
		iniciarBatalha (T1, T2, P1, P2);
		//iniciarBatalha (T1, T2, P3, P4);

		//TESTAR HEAL 
		
	}
}
