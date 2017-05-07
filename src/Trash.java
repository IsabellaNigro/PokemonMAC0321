
public class Trash extends Treinador {
	Trash() { 
		super("Trash", 6, new String[] {"Raichu", "Onix", "Pikachu", "Raichu", "Bulbasauro", "Graveler"});
	}
	public void atacar(int num, Pokemon inimigo) {
		System.out.println("Ataque do Trash realizado com sucesso!");
		inimigo.pokemonAtaca(num, inimigo);
	}
	public void trocarpokemon() {
		System.out.println("Trash trocou seu Pokemón!");
	}
	public void usaritem(Pokemon P) {
		if (P.vivoOuMorto() == true && P.getHPPokemon() + 25 <= P.getHPmax()){
			System.out.println("Trash usou um item de cura!");
			P.SetHP(25);
			System.out.println("O pokemón " +P.getNomePokemon()+" recebeu 25 de HP e ficou com "+ P.getHPPokemon()+"/"+P.getHPmax()+" de HP");
		}
	}
	/*
	public void fugir() {
		System.out.println("Trash fugiu da batalha!");
	}
	*/
	
	
}
