
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
	public void fugir() {
		System.out.println("James fugiu da batalha!");
	}
	
	public void usaritem(Pokemon P) {
		System.out.println("James usou um item de cura!");
		if (P.vivoOuMorto() == true && P.getHPPokemon() + 25 < P.getHPmax())
			P.SetHP(25);
	}
	
}
