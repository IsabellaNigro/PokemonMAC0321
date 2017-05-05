
public class Ash extends Treinador {
	public Ash() { 
		super("Ash", 2, new String[] {"Pikachu", "Bulbasauro", "Charmander", "Onix", "Graveler"});
	}
	
	public void atacar(int num, Pokemon inimigo) {
		System.out.println("Ataque do Ash realizado com sucesso!");
		inimigo.pokemonAtaca(num, inimigo);
	}
	public void trocarpokemon() {
		System.out.println("Ash trocou seu Pokemón!");
	}
	public void usaritem() {
		System.out.println("Ash usou um item de cura!");
	}
	public void fugir() {
		System.out.println("Ash fugiu da batalha!");
	}
}
