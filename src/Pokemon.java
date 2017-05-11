
abstract class Pokemon {
	//nome do pokemon
	private String nome;
	//cada pokemon tem ate 4 ataques diferentes
	private String ataque[] = new String[4]; 
	//vida do pokemon
	private int HP;
	//cada ataque tem uma quantidade de dano
	private int dano[] = new int[4];
	//cada pokemon tem um tipo
	private int tipo;
	//guardando o maximo de HP do pokemon
	private int HPmax;
	//construtor
	Pokemon(String nome, int HP, int tipo, String ataque[], int dano[]){
		this.nome = nome;
		this.HPmax = HP;
		this.HP = HP;
		this.tipo = tipo;
		this.ataque[0] = ataque[0];
		this.ataque[1] = ataque[1];
		this.ataque[2] = ataque[2];
		this.ataque[3] = ataque[3];
		this.dano[0] = dano[0];
		this.dano[1] = dano[1];
		this.dano[2] = dano[2];
		this.dano[3] = dano[3];
	}
	
	/*  		 grama fogo agua eletrico vento pedra dragao terra
	 * grama      0.5  0.5  2.0    1.0     0.5   2.0   0.5    2.0       
	 *	fogo	  2.0  0.5  0.5    1.0     1.0   0.5   1.0    1.0
	 *	agua	  0.5  2.0  0.5    1.0     1.0   2.0   0.5    2.0
	 *	eletrico  0.5  1.0  2.0    0.5     2.0   1.0   0.5    0.0
	 *	vento	  2.0  1.0  1.0    0.5     1.0   0.5   1.0    1.0
	 *	pedra	  1.0  2.0  1.0    1.0     2.0   1.0   1.0    0.5
	 *	dragao	  1.0  1.0  1.0    1.0     1.0   1.0   2.0    1.0
	 *	terra	  1.0  2.0  1.0    2.0     0.0   2.0   1.0    1.0
	 */
	private double tabeladedanos[][]= {
			{0.5, 0.5, 2.0, 1.0, 0.5, 2.0, 0.5, 2.0},       
			{2.0, 0.5, 0.5, 1.0, 1.0, 0.5, 1.0, 1.0},
			{0.5, 2.0, 0.5, 1.0, 1.0, 2.0, 0.5, 2.0},
			{0.5, 1.0, 2.0, 0.5, 2.0, 1.0, 0.5, 0.0},
			{2.0, 1.0, 1.0, 0.5, 1.0, 0.5, 1.0, 1.0},
			{1.0, 2.0, 1.0, 1.0, 2.0, 1.0, 1.0, 0.5},
			{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 2.0, 1.0},
			{1.0, 2.0, 1.0, 2.0, 0.0, 2.0, 1.0, 1.0},
            };
	
	public String getNomePokemon(){
		return nome;
	}
	
	public double getMatrizdeDano(int tipoatual, int tipoinimigo){
		return tabeladedanos[tipoatual][tipoinimigo];
	}
	
	public int getHPPokemon(){
		return HP;
	}
	
	//metodo que retorna o tipo do pokemon
	public int getTipo(){
		return tipo;
	}
	
	public int getHPmax(){
		return HPmax;
	}
	//metodo para adicionar ou retirar HP de acordo com a batalha
	public int SetHP(int HP){
		this.HP = this.HP + HP;
		return this.HP; 
	}
	//metodo para imprimir os ataques
	public String imprimeAtaque(int num){
		if (num>=1 && num<=4) 
			return ataque[num -1];
		else return null;
		
	}
	public void pokemonAtaca(int num, Pokemon inimigo, Pokemon atual){
		if (num >=1 && num<=4){
			if (inimigo.getHPPokemon()-dano[num-1]>0)
				System.out.println("O pokemón "+inimigo.getNomePokemon()+" está com "+inimigo.SetHP((int)(-(atual.getMatrizdeDano(atual.getTipo(), inimigo.getTipo())*(dano[num-1]))))+"/"+inimigo.getHPmax()+" de HP");

			else
				System.out.println("O pokemón "+inimigo.getNomePokemon()+" ficou com "+inimigo.SetHP(-inimigo.getHPPokemon())+" de HP e morreu!!");
			
			if (atual.getMatrizdeDano(atual.getTipo(), inimigo.getTipo()) == 0.0)
				System.out.println("O ataque não funcionou!");
			if (atual.getMatrizdeDano(atual.getTipo(), inimigo.getTipo()) == 0.5)
				System.out.println("O ataque não foi muito efetivo!");
			if (atual.getMatrizdeDano(atual.getTipo(), inimigo.getTipo()) == 1.0)
				System.out.println("Dano normal");
			if (atual.getMatrizdeDano(atual.getTipo(), inimigo.getTipo()) == 2.0)
				System.out.println("Ataque muito efetivo!!!!!");
		}
	}
	
	//FUNCAO PRA CHECAR SE ESTA VIVO
	public boolean vivoOuMorto(){
		if (HP>0){
			return true;
		}
		else return false;
	}
}
