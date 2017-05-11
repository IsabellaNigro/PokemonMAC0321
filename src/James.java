
public class James extends Treinador {
	public James() { 
		super("James", 6, new String[] {"Pikachu", "Bulbasauro", "Charmander", "Onix", "Graveler", "Pidgeotto"});
	}
	
	public void atacar(int num, Pokemon inimigo, Pokemon atual) {
		System.out.println("Ataque do James realizado com sucesso!");
		inimigo.pokemonAtaca(num, inimigo, atual);
	}
	public void trocarpokemon() {
		System.out.println("James trocou seu Pokemón!");
	}
	public void usaritem() {
		System.out.println("James usou um item de cura!");
	}

	public boolean usaritem(Pokemon P) {
		if (P.vivoOuMorto() == true && P.getHPPokemon() + 25 <= P.getHPmax()){
			System.out.println("James usou um item de cura!");
			P.SetHP(25);
			System.out.println("O pokemón " +P.getNomePokemon()+" recebeu 25 de HP e ficou com "+ P.getHPPokemon()+"/"+P.getHPmax()+" de HP");
			return true;
		}
		else if (P.vivoOuMorto() == true && P.getHPPokemon() + 25 > P.getHPmax()){
			return false;
		}
		return true;
	}
	
}
