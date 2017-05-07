
abstract class Treinador {
	private int numpokemons;  //todos os treinadores possuem um certo numero de pokemons
	private String[] pokemon = new String[6];  //nomes dos pokemons de cada treinador
	private String treinador;  //nome do treinador
	private boolean continuaBatalha=true;
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
	abstract void usaritem(Pokemon P);
	//abstract void fugir();
	
	
	public String getNomeTreinador() {
		return treinador;
	}
	
	public int getNumPokemons() {
		return numpokemons;
	}
	
	
	public void listaNomePokemon(int a, int numerodemortos) {
		for (int i=numerodemortos; i<a-1; i++)
			System.out.print(pokemon[i]+", ");
		if (a!=numerodemortos)
			System.out.println(pokemon[a-1]);
		else System.out.println("não há mais pokemóns!");
	}
	
	public boolean getContinuaBatalha() {
		return continuaBatalha;
	}
	
	public boolean setContinuaBatalha() {
		return continuaBatalha=false;
	}
	
	// devolve o valor de i, sendo P[i] o pokemon que ainda esta vivo e foi trocado
	public void trocarPokemonAtual(Pokemon Atual, Pokemon Novo) {
		System.out.println("O pokemón "+Atual.getNomePokemon()+" foi trocado pelo pokemón "+Novo.getNomePokemon());
	}
	
}
