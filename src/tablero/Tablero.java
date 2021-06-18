package src.tablero;
public class Tablero{
	/*public static void main(String[] args) {
		Tablero t = new Tablero();
	}*/

	String wr = "\033[47;31m";
    String reset ="\033[0m";
    String nr = "\033[40;31m";
    String fw = "\033[47;37m";
    String fn = "\033[40;30m";
    String nw = "\033[40;37m";

	public Tablero(){
		int [] [] tabla = new int [8][8];
		/*llenartabla(tabla);
		imprimirtabla(tabla,8,8);
		System.out.print("\n\n");
		pintartabla();*/
	}

	public void llenartabla(int [][] mat){
		for(int i = 0; i<8; i++){
			for(int j = 0; j<8; j++){
				mat[i][j]= 0;
			}
		}
	}

	public void imprimirtabla(int[][] tab, int fil, int col){
		for (int i = 0 ; i<fil;i++){
			for (int j = 0 ; j<col ; j++){
				System.out.print(wr+tab[j][i] + " "+reset);
			}
			System.out.println();
		}	
	}

	// muestra de tabla System.out.print(" O "" O "" O "" O "" O "" O "" O "" O ");
    
	public void pintartabla(){
		System.out.println("  H  G  F  E  D  C  B  A");//0
		System.out.println("8"+fw+" O "+nr+" O "+fw+" O "+nr+" O "+fw+" O "+nr+" O "+fw+" O "+nr+" O "+reset+"1");//1
		System.out.println("7"+nr+" O "+fw+" O "+nr+" O "+fw+" O "+nr+" O "+fw+" O "+nr+" O "+fw+" O "+reset+"2");//2
		System.out.println("6"+fw+" O "+fn+" O "+fw+" O "+fn+" O "+fw+" O "+fn+" O "+fw+" O "+fn+" O "+reset+"3");//3
		System.out.println("5"+fn+" O "+fw+" O "+fn+" O "+fw+" O "+fn+" O "+fw+" O "+fn+" O "+fw+" O "+reset+"4");//4
		System.out.println("4"+fw+" O "+fn+" O "+fw+" O "+fn+" O "+fw+" O "+fn+" O "+fw+" O "+fn+" O "+reset+"5");//5
		System.out.println("3"+fn+" O "+fw+" O "+fn+" O "+fw+" O "+fn+" O "+fw+" O "+fn+" O "+fw+" O "+reset+"6");//6
		System.out.println("2"+fw+" O "+nw+" O "+fw+" O "+nw+" O "+fw+" O "+nw+" O "+fw+" O "+nw+" O "+reset+"7");//7
		System.out.println("1"+nw+" O "+fw+" O "+nw+" O "+fw+" O "+nw+" O "+fw+" O "+nw+" O "+fw+" O "+reset+"8");//8
		System.out.println("  A  B  C  D  E  F  G  H");//fin

	}
	

}