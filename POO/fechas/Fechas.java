import java.time.*;
public class Fechas{
	public static void main(String[] arg){
	//imprimir la fecha actual
	LocalDate fechaActual = LocalDate.now();
	System.out.println(fechaActual);
	System.out.printf("%s-%s-%s%n", fechaActual.getDayOfMonth(),
	fechaActual.getMonthValue(), fechaActual.getYear());
	//vamos a sumar 5 horas
	LocalTime time = LocalTime.now();
	System.out.println(time);
	LocalTime newTime;
	newTime = time.plusHours(5);
	System.out.println(newTime);
	//imprimimos fecha y hora
	LocalDateTime dateTime = LocalDateTime.now();
	System.out.println(dateTime);
	}
}
