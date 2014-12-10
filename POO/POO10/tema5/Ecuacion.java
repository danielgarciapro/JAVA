public class Ecuacion{
	private double a,b,c,d,e,f;
	
	public Ecuacion(double a, double b, double c, double d, double e, double f){
		this.a=a; this.b=b; this.c=c; this.d=d; this.e=e; this.f=f;	
		}
	//metodo que dice si es resoluble o no el sistema; a · d − b · c es distinto de 0 para ser resoluble
	public boolean esResoluble(){
		return this.a*this.d-this.b*this.c != 0;
		}
	//metodo que obtine x = (e·d−b·f) / (a·d−b·c)
	public double getX(){
		return (this.e*this.d-this.b*this.f)/(this.a*this.d-this.b*this.c);
		}
	//metodo que obtine y = (a·f−e·c) / (a·d−b·c)
	public double getY(){
		return (this.a*this.f-this.e*this.c)/(this.a*this.d-this.b*this.c);
		}
	@Override
	public String toString(){
		return (this.a+"·x + "+this.b+"·y = "+this.e+"\n"+this.c+"·x + "+this.d+"·y = "+this.f);
		}
}
