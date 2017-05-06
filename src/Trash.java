
public class Trash extends Treinador {
	Trash() { 
		super("Trash", 5, new String[] {"Bulbasauro", "Pikachu", "Raichu", "Onix", "Graveler"});
	}
	public void atacar(int num, Pokemon inimigo) {
		System.out.println("Ataque do Trash realizado com sucesso!");
		inimigo.pokemonAtaca(num, inimigo);
	}
	public void trocarpokemon() {
		System.out.println("Trash trocou seu Pokemón!");
	}
	public void usaritem() {
		System.out.println("Trash usou um item de cura!");
	}
	public void fugir() {
		System.out.println("Trash fugiu da batalha!");
	}
	public int getHP(Pokemon escolhido) {
		return escolhido.getHPPokemon();
	}
	
}
