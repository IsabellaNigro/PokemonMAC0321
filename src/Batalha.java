import java.util.Random;

public class Batalha {
	static int numdemortosA=0;
	static int numdemortosB=0;
	
	public static void listarPokemonsDoTreinadorA(Treinador A){
		//so listamos os pokemons de A se o treinador ainda tiver pokemons vivos
		if (A.getNumPokemons()>0) {
			// deixei a linha de baixo com comentario pq ta dando problema (tirando mais de uma vez os mortos)
			System.out.println("O treinador "+A.getNomeTreinador()+" possui "+(A.getNumPokemons()-numdemortosA)+" pokemóns!");
			System.out.print("Os pokemóns de "+A.getNomeTreinador()+" são: ");
			A.listaNomePokemon(A.getNumPokemons());  
			System.out.println();
		}
		else System.out.println("O treinador "+A.getNomeTreinador()+" não tem pokemóns!!!");
	}
	
	public static void listarPokemonsDoTreinadorB(Treinador B){
		//so listamos os pokemons de B se o treinador ainda tiver pokemons vivos
		if (B.getNumPokemons()>0) {
			// deixei a linha de baixo com comentario pq ta dando problema (tirando mais de uma vez os mortos)
			System.out.println("O treinador "+B.getNomeTreinador()+" possui "+(B.getNumPokemons()-numdemortosB)+" pokemóns!");
			System.out.print("Os pokemóns de "+B.getNomeTreinador()+" são: ");
			B.listaNomePokemon(B.getNumPokemons()); 
			System.out.println();
		}
		else System.out.println("O treinador "+B.getNomeTreinador()+" não tem pokemóns!!!");
	}
	//gera um numero aleatorio para escolher os ataques dos pokemons
	public static int gerarAtaqueRandomico() {
		int max=4;
	    int min=1;
	    int diff=max-min;
	    Random rn = new Random();
	    int i = rn.nextInt(diff+1);
	    i+=min;
	    return i;
	}
	
	public static int gerarAcaoRandomico() {
		int max=100;
	    int min=1;
	    int diff=max-min;
	    Random rn = new Random();
	    int i = rn.nextInt(diff+1);
	    i+=min;
	    return i;
	}
	// guardamos o numero de pokemons mortos de cada treinador para saber quando trocar ou terminar a batalha
	public static void numDePokemonsMortosDeA(){
		numdemortosA++;
	}
	
	public static void numDePokemonsMortosDeB(){
		numdemortosB++;
	}
	
	//o metodo imprime os pokemons escolhidos e seus HPs
	public static void escolhasDePokemons(Treinador A, Treinador B, Pokemon PA, Pokemon PB){
		if (numdemortosA < A.getNumPokemons() && numdemortosB < B.getNumPokemons() ){
			System.out.println("O treinador "+A.getNomeTreinador()+" irá escolher seu pokemón!");
			System.out.println("O pokemón escolhido foi: "+PA.getNomePokemon()+" e seu HP é: "+PA.getHPPokemon()+"/"+PA.getHPmax());
			System.out.println();
			System.out.println("O treinador "+B.getNomeTreinador()+" irá escolher seu pokemón!");
			System.out.println("O pokemón escolhido foi: "+PB.getNomePokemon()+" e seu HP é: "+PB.getHPPokemon()+"/"+PB.getHPmax());
			System.out.println();
		}
	}
	
	//metodo que sera chamado enquanto houver batalha 
	public static void batalha(Treinador A, Treinador B, Pokemon PA, Pokemon PB, int i, int j){ // i e j guardam a posicao do pokemon atual
		int numerodoataque=gerarAtaqueRandomico();
		int variaveldeacao =gerarAcaoRandomico();
		System.out.println("AS VARIAVEIS SAOOOOOOOOOOO    "+variaveldeacao);
		if (PA.vivoOuMorto() == true && A.getContinuaBatalha()==true && B.getContinuaBatalha()==true){
			if (variaveldeacao>=1 && variaveldeacao<=59){
				System.out.println("O treinador "+A.getNomeTreinador()+" irá atacar com o pokemón "+PA.getNomePokemon()+"!");
				System.out.println("O treinador irá usar "+PA.imprimeAtaque(numerodoataque));
				System.out.println();
				PA.pokemonAtaca(numerodoataque, PB); 
			//dps de cada ataque devemos checar se o pokemon que recebeu o ataque nao morreu, se morreu devemos listar os pokemons tirando o morto
				vivoOuMorto(A, B, PA, PB, i, j);
			}
			if (variaveldeacao==60 || variaveldeacao==61 )
				B.setContinuaBatalha(); //O TREINADOR FOGE DA BATALHA
			if (variaveldeacao>=62 && variaveldeacao<=90 )
				B.usaritem(PB); // colocar condicao para fugir e curar nao ocorrerem ao mesmo tempo
			if (variaveldeacao>=91 && variaveldeacao<=100) {
				B.trocarpokemon();
				B.setTrocarPokemon(true);
			}
		}
		System.out.println();
		variaveldeacao =gerarAcaoRandomico();
		if (PB.vivoOuMorto() == true && B.getContinuaBatalha()==true && A.getContinuaBatalha()==true){
			if(variaveldeacao>=1 && variaveldeacao<=59){
				System.out.println("O treinador "+B.getNomeTreinador()+" irá atacar com o pokemón "+PB.getNomePokemon()+"!");
				System.out.println("O treinador irá usar "+PB.imprimeAtaque(numerodoataque));
				System.out.println();
				PB.pokemonAtaca(numerodoataque, PA);
				vivoOuMorto(A, B, PA, PB, i, j);
			}
			if (variaveldeacao==60 || variaveldeacao==61)
				A.setContinuaBatalha(); //O TREINADOR FOGE DA BATALHA
			if (variaveldeacao>=62 && variaveldeacao<=90)
				A.usaritem(PA); // colocar condicao para fugir e curar nao ocorrerem ao mesmo tempo
			if (variaveldeacao>=91 && variaveldeacao<=100) {
				A.trocarpokemon();
				A.setTrocarPokemon(true);
			}

		}
		System.out.println();
		
		if (A.getContinuaBatalha()==false) {
			System.out.println("O treinador "+A.getNomeTreinador()+" fugiu!");
			System.out.println("O treinador "+B.getNomeTreinador()+" venceu a batalha!!");
		}
		if (B.getContinuaBatalha()==false) {
			System.out.println("O treinador "+B.getNomeTreinador()+" fugiu!");
			System.out.println("O treinador "+A.getNomeTreinador()+" venceu a batalha!!");
		}
	}
	

	
	public static void vivoOuMorto(Treinador A, Treinador B, Pokemon PA, Pokemon PB, int i, int j){ // i e j utilizados para retirar o pokemon do vetor (NULL)
		if (PB.vivoOuMorto()==false) {
			numDePokemonsMortosDeB();
			B.setNomePokemon(j);
			listarPokemonsDoTreinadorB(B);
		}
		if (PA.vivoOuMorto()==false) {
			numDePokemonsMortosDeA();
			A.setNomePokemon(i);
			listarPokemonsDoTreinadorA(A);
		}
	}
	
	//metodo para iniciar batalha chamando o metodo batalha ate nao haver pokemons ou ate fuga
	public static void iniciarBatalha (Treinador A, Treinador B, Pokemon PA[], Pokemon PB[]) {
		System.out.println("A batalha Pokemón entre "+A.getNomeTreinador()+" e "+B.getNomeTreinador()+" irá começar!");
		System.out.println();
		listarPokemonsDoTreinadorA(A);
		listarPokemonsDoTreinadorB(B);
		int i=0, j=0;
		for (int k=0; k<6; k++) {
			while (i<A.getNumPokemons() && j<B.getNumPokemons() && A.getContinuaBatalha()==true && B.getContinuaBatalha()==true) {
				if (PA[i].getHPPokemon()<=0 || A.getTrocarPokemon()==true){
					//se o pokemon atual morreu vai pro proximo 
					i++; 
					if (A.getTrocarPokemon()==true)
						A.setTrocarPokemon(false);
				}
					
				if (PB[j].getHPPokemon()<=0 || B.getTrocarPokemon()==true){ // se o pokemon atual morreu vai pro proximo 
					j++; 
					if (B.getTrocarPokemon()==true)
						B.setTrocarPokemon(false);
				}
				if (i<A.getNumPokemons() && j<B.getNumPokemons()) {
					escolhasDePokemons(A, B, PA[i], PB[j]); 
					batalha(A, B, PA[i], PB[j], i, j);
				}
			}
		}
		
		if (i==A.getNumPokemons()) {
			System.out.println(B.getNomeTreinador()+" venceu a batalha!!");
		}
		if (j==B.getNumPokemons()) {
			System.out.println(A.getNomeTreinador()+" venceu a batalha!!");
		}
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		numdemortosA = 0;
		numdemortosB = 0;
	}
	

	public static void main(String[] args) {
		Pokemon[] PA1 = new Pokemon[6];
		Pokemon[] PB1 = new Pokemon[6];
		PA1[0] = new Pikachu();
		PA1[1] = new Bulbasaur();
		PA1[2] = new Charmander();
		PA1[3] = new Onix();
		PA1[4] = new Graveler();
		PA1[5] = new Pidgeotto();
		PB1[0] = new Raichu();
		PB1[1] = new Onix();
		PB1[2] = new Pikachu();
		PB1[3] = new Raichu();
		PB1[4] = new Bulbasaur();
		PB1[5] = new Graveler();

		Pokemon[] PA2 = new Pokemon[6];
		Pokemon[] PB2 = new Pokemon[6];
		PA2[0] = new Ninetales();
		PA2[1] = new Cyndaquil();
		PA2[2] = new Dratini();
		PA2[3] = new Totodile();
		PA2[4] = new Squirtle();
		PA2[5] = new Pidgeotto();
		PB2[0] = new Pikachu();
		PB2[1] = new Bulbasaur();
		PB2[2] = new Charmander();
		PB2[3] = new Onix();
		PB2[4] = new Graveler();
		PB2[5] = new Pidgeotto();
		
		Ash T1 = new Ash ();
		Trash T2 = new Trash ();
		Brock T3 = new Brock ();
		James T4 = new James ();

		iniciarBatalha (T1, T2, PA1, PB1);
		iniciarBatalha (T3, T4, PA2, PB2);

		
	}
}
