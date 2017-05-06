
public class Brock extends Treinador {
	public Brock() { 
		super("Brock", 5, new String[] {"Ninetales", "Cyndaquil", "Dratini", "Totodile", "Squirtle", null});
	}
	
	public void atacar(int num, Pokemon inimigo) {
		System.out.println("Ataque do Brock realizado com sucesso!");
		inimigo.pokemonAtaca(num, inimigo);
	}
	public void trocarpokemon() {
		System.out.println("Brock trocou seu Pokemón!");
	}
	public void usaritem() {
		System.out.println("Brock usou um item de cura!");
	}
	public void fugir() {
		System.out.println("Brock fugiu da batalha!");
	}
	
	public void usaritem(Pokemon P) {
		System.out.println("Brock usou um item de cura!");
		if (P.vivoOuMorto() == true && P.getHPPokemon() + 25 < P.getHPmax())
			P.SetHP(25);
	}
	
}
