
public class Trash extends Treinador {
	Trash() { 
		super("Trash", 6, new String[] {"Raichu", "Onix", "Pikachu", "Raichu", "Bulbasauro", "Graveler"});
	}
	public void atacar(int num, Pokemon inimigo, Pokemon atual) {
		System.out.println("Ataque do Trash realizado com sucesso!");
		inimigo.pokemonAtaca(num, inimigo, atual);
	}
	public void trocarpokemon() {
		System.out.println("Trash trocou seu Pokemón!");
	}
	public boolean usaritem(Pokemon P) {
		if (P.vivoOuMorto() == true && P.getHPPokemon() + 25 <= P.getHPmax()){
			System.out.println("Trash usou um item de cura!");
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
