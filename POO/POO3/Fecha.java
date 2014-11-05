public class Fecha{
	private int dia;
	private int mes;
	private int anno; //no recomendado usar la ñ
	public int getDia(){
		return this.dia;
	}
	public int getMes(){
		return this.mes;
	}
	public int getAnno(){
		return this.anno;
	}
	public void setDia(int d){
		this.dia=d;
	}
	public void setMes(int m){
		this.mes=m;
	}
	public void setAnno(int a){
		this.anno=a;
	}
}
