
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
	public boolean usaritem(Pokemon P) {
		if (P.vivoOuMorto() == true && P.getHPPokemon() + 25 <= P.getHPmax()){
			System.out.println("Trash usou um item de cura!");
			P.SetHP(25);
			System.out.println("O pokemón " +P.getNomePokemon()+" recebeu 25 de HP e ficou com "+ P.getHPPokemon()+"/"+P.getHPmax()+" de HP");
			return true;
		}
		else if (P.vivoOuMorto() == true && P.getHPPokemon() + 25 > P.getHPmax()){
			System.out.println("Trash tentou usar um item de cura");
			System.out.println("Trash não pode usar um item de cura pois a vida do pokemón já está alta!");
			return false;
		}
		else if (P.vivoOuMorto() != true){
			System.out.println("Trash tentou usar um item de cura");
			System.out.println("Trash não pode usar um item de cura pois o pokemón está morto!");
			return false;
		}
		return true;
	}
	/*
	public void fugir() {
		System.out.println("Trash fugiu da batalha!");
	}
	*/
	
	
}
