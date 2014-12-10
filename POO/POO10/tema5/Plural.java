import javax.swing.JOptionPane;
public class Plural{
	private String palabra;
	public Plural(String p){
		this.palabra=p;
		}
	public String devuelvePlural(){
		if (palabra.endsWith ("l") || palabra.endsWith ("r") || palabra.endsWith ("n") || palabra.endsWith ("d")
		 || palabra.endsWith ("z") || palabra.endsWith ("j") || palabra.endsWith ("ay") || palabra.endsWith ("ey")
		  || palabra.endsWith ("iy") || palabra.endsWith ("oy") || palabra.endsWith ("uy")){
			return this.palabra+"es";
			
			}
		else if (palabra.endsWith ("s") || palabra.endsWith ("x")){
			return this.palabra;
			
			}
		else if (palabra.endsWith ("í") || palabra.endsWith ("ú")){
			String pa1=this.palabra+"es";
			String pa2=this.palabra+"s";
			
			return "La palabra "+this.palabra+"  tiene el plural "+pa1+" y "+pa2;
			
			}
		else return this.palabra+"s";
		}
	}
class TestPlural{
	public static void main(String[] arg){
		String pal = JOptionPane.showInputDialog("Introduzca una palabra para saber su plural...");
		Plural p1 = new Plural(pal);
		JOptionPane.showMessageDialog(null, "La palabra en plural es "+p1.devuelvePlural(), "PLURALES", JOptionPane.INFORMATION_MESSAGE);
		//System.out.println("Hola "+p1.devuelvePlural());
		}
	}
