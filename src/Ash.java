
public class Ash extends Treinador {
	public Ash() { 
		super("Ash", 6, new String[] {"Pikachu", "Bulbasauro", "Charmander", "Onix", "Graveler", "Pidgeotto"});
	}
	
	public void atacar(int num, Pokemon inimigo) {
		System.out.println("Ataque do Ash realizado com sucesso!");
		inimigo.pokemonAtaca(num, inimigo);
	}
	public void trocarpokemon() {
		System.out.println("Ash trocou seu Pokemón!");
	}
	public void usaritem(Pokemon P) {
		if (P.vivoOuMorto() == true && P.getHPPokemon() + 25 <= P.getHPmax()){
			System.out.println("Ash usou um item de cura!");
			P.SetHP(25);
			System.out.println("O pokemón " +P.getNomePokemon()+" recebeu 25 de HP e ficou com "+ P.getHPPokemon()+"/"+P.getHPmax()+" de HP");
		}
		else if (P.vivoOuMorto() == true && P.getHPPokemon() + 25 > P.getHPmax()){
			System.out.println("Ash tentou usar um item de cura");
			System.out.println("Ash não pode usar um item de cura pois a vida do pokemón já está alta!");
		}
		else if (P.vivoOuMorto() != true){
			System.out.println("Ash tentou usar um item de cura");
			System.out.println("Ash não pode usar um item de cura pois o pokemón está morto!");
		}
	}
	/*
	public void fugir() {
		System.out.println("Ash fugiu da batalha!");
	}
	*/
	
}
