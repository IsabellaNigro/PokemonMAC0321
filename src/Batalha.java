
public class Batalha {
	public void iniciarBatalha (Treinador A, Treinador B) {
		System.out.println("A batalha Pokemón entre "+A.getNomeTreinador()+"e "+B.getNomeTreinador()+" irá começar!");
		System.out.println("O treinador "+A.getNomeTreinador()+" possui "+A.getNumPokemons()+" pokemóns!");
		System.out.println("Os pokemóns de "+A.getNomeTreinador()+" são: "+A.getNomePokemons());
		System.out.println("O treinador "+B.getNomeTreinador()+" possui "+B.getNumPokemons()+" pokemóns!");
		System.out.println("Os pokemóns de "+B.getNomeTreinador()+" são: "+B.getNomePokemons());

	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Ash T1 = new Ash ();
		Trash T2 = new Trash ();
		Pikachu P1 = new Pikachu ();
		Bulbasaur P2 = new Bulbasaur();
		Charmander P3 = new Charmander();
		Onix P4 = new Onix ();
		Graveler P5 = new Graveler();
		
	}
}
