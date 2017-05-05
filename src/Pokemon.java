
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
	private String tipo;
	//construtor
	Pokemon(String nome, int HP, String tipo, String ataque[], int dano[]){
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
	public int GetHP(){
		return HP;
	}
	//metodo para adicionar ou retirar HP de acordo com a batalha
	public int SetHP(int HP){
		return this.HP + HP; 
	}
	//metodo para imprimir os ataques 
	public void Ataque(int num){
		if (num == 1) System.out.println(ataque[0]);
		if (num == 2) System.out.println(ataque[1]);
		if (num == 3) System.out.println(ataque[2]);
		if (num == 4) System.out.println(ataque[3]);
	}
	
}
