
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
		System.out.println("Trash usou um item de cura!");
		if (P.vivoOuMorto() == true && P.getHPPokemon() + 25 < P.getHPmax())
			P.SetHP(25);
	}
	public void fugir() {
		System.out.println("Trash fugiu da batalha!");
	}
	
	
}
