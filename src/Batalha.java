
public class Batalha {
	public void Batalha(Treinador A, Treinador B, Pokemon PA, Pokemon PB){
		
	}
	public static void iniciarBatalha (Treinador A, Treinador B, Pokemon PA, Pokemon PB) {
		System.out.println("O treinador "+A.getNomeTreinador()+" possui "+A.getNumPokemons()+" pokemóns!");
		System.out.print("Os pokemóns de "+A.getNomeTreinador()+" são: ");
		A.listaNomePokemon(2);
		System.out.println("O treinador "+B.getNomeTreinador()+" possui "+B.getNumPokemons()+" pokemóns!");
		System.out.print("Os pokemóns de "+B.getNomeTreinador()+" são: ");
		B.listaNomePokemon(3);
		System.out.println("O treinador "+A.getNomeTreinador()+" irá escolher seu primeiro pokemón!");
		System.out.println("O pokemón escolhido foi: "+A.getNomePokemon(0)+" e seu HP é: "+A.getHP(PA));
		System.out.println("O treinador "+B.getNomeTreinador()+" irá escolher seu primeiro pokemón!");
		System.out.println("O pokemón escolhido foi: "+B.getNomePokemon(0)+" e seu HP é: "+B.getHP(PB));
		System.out.println("O treinador "+A.getNomeTreinador()+" irá atacar com o pokemón "+A.getNomePokemon(0)+"!");
		System.out.println("O treinador irá usar "+PA.imprimeAtaque(1));
		PA.pokemonAtaca(1, PB);
		if (PB.vivoOuMorto() )
		System.out.println("O treinador "+B.getNomeTreinador()+" irá atacar com o pokemón "+B.getNomePokemon(0)+"!");
		System.out.println("O treinador irá usar "+PB.imprimeAtaque(1));


	}

	
	public static void main(String[] args) {
		Ash T1 = new Ash ();
		Trash T2 = new Trash ();
		Pikachu P1 = new Pikachu ();
		Bulbasaur P2 = new Bulbasaur();
		Charmander P3 = new Charmander();
		Onix P4 = new Onix ();
		Graveler P5 = new Graveler(); 
		
		System.out.println("A batalha Pokemón entre "+T1.getNomeTreinador()+" e "+T2.getNomeTreinador()+" irá começar!");
		iniciarBatalha (T1, T2, P1, P2);
		//TESTAR HEAL 
		
	}
}
