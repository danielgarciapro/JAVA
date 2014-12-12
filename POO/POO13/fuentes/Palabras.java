public class Palabras{
	private String palabra;
	public Palabras(String p){
		this.palabra=p;
		}
	private boolean empiezaVocal(){
		if (this.palabra.toUpperCase().startsWith ("A") || this.palabra.toUpperCase().startsWith ("E") 
		|| this.palabra.toUpperCase().startsWith ("I") || this.palabra.toUpperCase().startsWith ("O") 
		|| this.palabra.toUpperCase().startsWith ("U")){
			return true;
			}else return false;
		}
		
	@Override
	public String toString(){
		return "La palabra "+this.palabra+" empieza por vocal?: "+empiezaVocal();
		}
}
