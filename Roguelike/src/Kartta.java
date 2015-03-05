
public class Kartta {
	private char[][] arvot;
	
	public Kartta(){
		arvot = new char[20][100];
	}
	
	public char annaArvo(int x, int y){
		return arvot[x][y];
	}
	public void asetaArvo(int x, int y, char merkki){
		arvot[x][y] = merkki;
	}
	public int annaRivienLkm(){
		return arvot.length;
	}
	public void karttaRuudulle(){
		for(int i = 0; i < arvot.length; i++){
			System.out.print("\n");
			for(int j = 0; j < arvot[i].length; j++){
				System.out.print(arvot[i][j]);
			}
		}
	}
}
