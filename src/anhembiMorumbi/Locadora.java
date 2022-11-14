package anhembiMorumbi;

public class Locadora {
	

private int y=1;
Filme[] filmes = new Filme[y];

public void add(Filme filme) {
	for (int i =0; i>y; i++) {
		filmes[i]=filme;
		y++;
	}
	
}



public Filme[] getFilmes() {
	return filmes;
}

public void setFilmes(Filme[] filmes) {
	this.filmes = filmes;
}




}
