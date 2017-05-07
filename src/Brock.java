
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

	/*
	public void fugir() {
		System.out.println("Brock fugiu da batalha!");
	}
	*/
	
	public boolean usaritem(Pokemon P) {
		if (P.vivoOuMorto() == true && P.getHPPokemon() + 25 <= P.getHPmax()){
			System.out.println("Brock usou um item de cura!");
			P.SetHP(25);
			System.out.println("O pokemón " +P.getNomePokemon()+" recebeu 25 de HP e ficou com "+ P.getHPPokemon()+"/"+P.getHPmax()+" de HP");
			return true;
		}
		else if (P.vivoOuMorto() == true && P.getHPPokemon() + 25 > P.getHPmax()){
			System.out.println("Brock tentou usar um item de cura");
			System.out.println("Brock não pode usar um item de cura pois a vida do pokemón já está alta!");
			return false;
		}
		else if (P.vivoOuMorto() != true){
			System.out.println("Brock tentou usar um item de cura");
			System.out.println("Brock não pode usar um item de cura pois o pokemón está morto!");
			return false;
		}
		return true;
	}
	
	
}
