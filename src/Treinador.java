
abstract class Treinador {
	private int numpokemons;  //todos os treinadores possuem um certo numero de pokemons
	private String[] pokemon = new String[6];  //nomes dos pokemons de cada treinador
	private String treinador;  //nome do treinador
	public Treinador (String treinador, int numpokemons, String pokemon[]) {
		this.treinador=treinador;
		this.numpokemons=numpokemons;
		this.pokemon[0]=pokemon[0];
		this.pokemon[1]=pokemon[1];
		this.pokemon[2]=pokemon[2];
		this.pokemon[3]=pokemon[3];
		this.pokemon[4]=pokemon[4];
		this.pokemon[5]=pokemon[5];
	}
	abstract void atacar(int num,Pokemon inimigo);
	abstract void trocarpokemon();
	abstract void usaritem();
	abstract void fugir();
	//abstract int getHP(Pokemon escolhido);
	
	public String getNomeTreinador() {
		return treinador;
	}
	
	public int getNumPokemons() {
		return numpokemons;
	}
	
	public String getNomePokemon (int a) {
		return this.pokemon[a];
	}
	
	public void listaNomePokemon(int a, int numerodemortos) {
		for (int i=numerodemortos; i<a-1; i++)
			System.out.print(pokemon[i]+", ");
		System.out.println(pokemon[a-1]);
	}
}
