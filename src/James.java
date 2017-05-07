
public class James extends Treinador {
	public James() { 
		super("James", 6, new String[] {"Pikachu", "Bulbasauro", "Charmander", "Onix", "Graveler", "Pidgeotto"});
	}
	
	public void atacar(int num, Pokemon inimigo) {
		System.out.println("Ataque do James realizado com sucesso!");
		inimigo.pokemonAtaca(num, inimigo);
	}
	public void trocarpokemon() {
		System.out.println("James trocou seu Pokemón!");
	}
	public void usaritem() {
		System.out.println("James usou um item de cura!");
	}
	/*
	public void fugir() {
		System.out.println("James fugiu da batalha!");
	}
	*/
	
	public void usaritem(Pokemon P) {
		if (P.vivoOuMorto() == true && P.getHPPokemon() + 25 <= P.getHPmax()){
			System.out.println("James usou um item de cura!");
			P.SetHP(25);
			System.out.println("O pokemón " +P.getNomePokemon()+" recebeu 25 de HP e ficou com "+ P.getHPPokemon()+"/"+P.getHPmax()+" de HP");
		}
		else if (P.vivoOuMorto() == true && P.getHPPokemon() + 25 > P.getHPmax()){
			System.out.println("James tentou usar um item de cura");
			System.out.println("James não pode usar um item de cura pois a vida do pokemón já está alta!");
		}
		else if (P.vivoOuMorto() != true){
			System.out.println("James tentou usar um item de cura");
			System.out.println("James não pode usar um item de cura pois o pokemón está morto!");
		}
	}
	
}
