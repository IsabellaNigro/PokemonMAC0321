
public class Batalha {
	static int numdemortosA=0;
	static int numdemortosB=0;
	public static void listarPokemonsDoTreinadorA(Treinador A, Pokemon PA){
		System.out.println("O treinador "+A.getNomeTreinador()+" possui "+A.getNumPokemons()+" pokemóns!");
		System.out.print("Os pokemóns de "+A.getNomeTreinador()+" são: ");
		A.listaNomePokemon(A.getNumPokemons(), numdemortosA);
	}
	
	public static void listarPokemonsDoTreinadorB(Treinador B, Pokemon PB){
		System.out.println("O treinador "+B.getNomeTreinador()+" possui "+B.getNumPokemons()+" pokemóns!");
		System.out.print("Os pokemóns de "+B.getNomeTreinador()+" são: ");
		B.listaNomePokemon(B.getNumPokemons(), numdemortosB);
	}
	
	public static void numDePokemonsMortosDeA(){
		numdemortosA++;
	}
	
	public static void numDePokemonsMortosDeB(){
		numdemortosB++;
	}

	public static void escolhasDePokemons(Treinador A, Treinador B, Pokemon PA, Pokemon PB){
		System.out.println("O treinador "+A.getNomeTreinador()+" irá escolher seu pokemón!");
		System.out.println("O pokemón escolhido foi: "+A.getNomePokemon(0)+" e seu HP é: "+A.getHP(PA));
		System.out.println("O treinador "+B.getNomeTreinador()+" irá escolher seu pokemón!");
		System.out.println("O pokemón escolhido foi: "+B.getNomePokemon(0)+" e seu HP é: "+B.getHP(PB));
	}
	
	public static void Batalha(Treinador A, Treinador B, Pokemon PA, Pokemon PB){
		System.out.println("O treinador "+A.getNomeTreinador()+" irá atacar com o pokemón "+A.getNomePokemon(0)+"!");
		System.out.println("O treinador irá usar "+PA.imprimeAtaque(1));
		PA.pokemonAtaca(1, PB);
		if (PB.vivoOuMorto()==false) {
			B.setNumPokemons();
			numDePokemonsMortosDeB();
			listarPokemonsDoTreinadorB(B, PB);
		}
		System.out.println("O treinador "+B.getNomeTreinador()+" irá atacar com o pokemón "+B.getNomePokemon(0)+"!");
		System.out.println("O treinador irá usar "+PB.imprimeAtaque(1));
		PB.pokemonAtaca(1, PA);
		if (PA.vivoOuMorto()==false) {
			A.setNumPokemons();
			numDePokemonsMortosDeA();
			listarPokemonsDoTreinadorA(A, PA);
		}

	}
	
	public static void vivoOuMorto(Treinador A, Treinador B, Pokemon PA, Pokemon PB){
		
	}
	public static void iniciarBatalha (Treinador A, Treinador B, Pokemon PA, Pokemon PB) {
		System.out.println("A batalha Pokemón entre "+A.getNomeTreinador()+" e "+B.getNomeTreinador()+" irá começar!");
		listarPokemonsDoTreinadorA(A, PA);
		listarPokemonsDoTreinadorB(B, PB);
		escolhasDePokemons(A, B, PA, PB);
		Batalha(A, B, PA, PB);
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
		//TESTAR HEAL 
		
	}
}
