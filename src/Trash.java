
public class Trash extends Treinador {
	Trash() { 
		super("Trash", 1, new String[] {"Pikachu", "Bulbasauro", "Pikachu", "Onix", "Graveler"});
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
}
