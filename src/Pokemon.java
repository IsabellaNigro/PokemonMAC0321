
abstract class Pokemon {
	//nome do pokemon
	private String nome;
	//cada pokemon tem ate 4 ataques diferentes
	private String ataque[] = new String[4]; 
	//vida do pokemon
	private int HP;
	//cada ataque tem uma quantidade de dano
	private String dano[] = new String[4];
	//cada pokemon tem um tipo
	private String tipo;
	//construtor
	Pokemon(String nome, int HP, String tipo, String ataque[], String dano[]){
		this.nome = nome;
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
}
