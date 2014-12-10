import javax.swing.JOptionPane;
public class Plural2{
	private String palabra;
	private String condicion="";
	public Plural2(String p){
		this.palabra=p;
		}
	public String extraeLetra(){
		condicion = this.palabra.substring(this.palabra.length()-1);
		return condicion;
	}
	public String devuelvePlural(){

		switch(extraeLetra()){

			case ("l"):
			case ("r"):
			case ("n"):
			case ("d"):
			case ("z"):
			case ("j"):
			case ("ay"):
			case ("ey"):
			case ("iy"):
			case ("oy"):
			case ("uy"):
						this.palabra = this.palabra+"es";
						break;
			case ("s"):
			case ("x"):
						//this.palabra = this.palabra;
						break;
			case ("i"):
			case ("ú"):
						String pa1=this.palabra+"es";
						String pa2=this.palabra+"s";
						System.out.println("La palabra "+this.palabra+"  tiene el plural "+pa1+" y "+pa2);
						break;
			default:
						this.palabra=this.palabra+"s";
		}
		return this.palabra;
	}
}
class TestPlurales{
	public static void main(String[] arg){
		String pal = JOptionPane.showInputDialog("Introduzca una palabra para saber su plural...");
		Plural2 p1 = new Plural2(pal);
		JOptionPane.showMessageDialog(null, "La palabra en plural es "+p1.devuelvePlural(), "PLURALES", JOptionPane.INFORMATION_MESSAGE);
	}
}
//porque no coje las tildes el JOptionPane