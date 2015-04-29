package ejercicio3;

public class Batalla {
	private Personajes personaje1;
	private Personajes personaje2;
	/**
	 * @param personaje1
	 * @param personaje2
	 */
	public Batalla(Personajes personaje1, Personajes personaje2) {
		
		this.personaje1 = personaje1;
		this.personaje2 = personaje2;
	}
	
	
	/**
	 * @return the personaje1
	 */
	public Personajes getPersonaje1() {
		return personaje1;
	}


	/**
	 * @return the personaje2
	 */
	public Personajes getPersonaje2() {
		return personaje2;
	}


	public void ataque(){
		int tiradaPersonaje1 = (int) (Math.random()*10);
		int tiradaPersonaje2 = (int) (Math.random()*10);
		if (tiradaPersonaje1>tiradaPersonaje2){
			System.out.println(personaje1.getNombre()+" ataca a "+personaje2.getNombre());
			System.out.println("Te restan "+tiradaPersonaje1+" puntos de energia");
			personaje2.setEnergia(personaje2.getEnergia()-tiradaPersonaje1);
			System.out.println("Tu vida es "+personaje1.getEnergia());
			System.out.println("Tu vida es "+personaje2.getEnergia());
		}
		if (tiradaPersonaje1<tiradaPersonaje2) {
			System.out.println(personaje2.getNombre()+" ataca a "+personaje1.getNombre());
			System.out.println("Te restan "+tiradaPersonaje2+" puntos de energia");
			personaje1.setEnergia(personaje1.getEnergia()-tiradaPersonaje2);
			System.out.println("Tu vida es "+personaje1.getEnergia());
			System.out.println("Tu vida es "+personaje2.getEnergia());
		}
		if (tiradaPersonaje1==tiradaPersonaje2) System.out.println("Han chocado sus armas, nadie ataca!!");
	}
	public void defensa(){
		int tiradaPersonaje1 = (int) (Math.random()*10);
		int tiradaPersonaje2 = (int) (Math.random()*10);
		if (tiradaPersonaje1>tiradaPersonaje2){
			System.out.println(personaje1.getNombre()+" es mas rapido que "+personaje2.getNombre());
			if (personaje1 instanceof Guerreros) ((Guerreros) personaje1).berserker();
			if (personaje1 instanceof Magos) ((Magos) personaje1).curar();
			System.out.println("Tu vida es "+personaje1.getEnergia());
			System.out.println("Tu vida es "+personaje2.getEnergia());
		}
		if (tiradaPersonaje1<tiradaPersonaje2){
			System.out.println(personaje2.getNombre()+" es mas rapido que "+personaje1.getNombre());
			if (personaje2 instanceof Guerreros) ((Guerreros) personaje2).berserker();
			if (personaje2 instanceof Magos) ((Magos) personaje2).curar();
			System.out.println("Tu vida es "+personaje1.getEnergia());
			System.out.println("Tu vida es "+personaje2.getEnergia());
		}
		if (tiradaPersonaje1==tiradaPersonaje2) System.out.println("Han chocado sus poderes, nadie ataca!!");

	}
}
