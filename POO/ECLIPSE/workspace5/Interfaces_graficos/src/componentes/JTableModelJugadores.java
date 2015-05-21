package componentes;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class JTableModelJugadores extends AbstractTableModel{

	ArrayList<Jugador> jugadores;
	String[] cabezera;
	
	public JTableModelJugadores(ArrayList<Jugador> lista, String[] cabezera) {
		// TODO Auto-generated constructor stub
		this.jugadores=lista;
		this.cabezera=cabezera;
	}
	
	@Override
	public int getRowCount() {
		return jugadores.size();
	}

	@Override
	public int getColumnCount() {
		return 2;
	}
	
	public String getColumnName(int col) {
		return cabezera[col];
		}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Jugador j = jugadores.get(rowIndex);
		if (columnIndex==0) return j.getNombre();
		else if (columnIndex==1) return j.getEquipo();
		else return "";
	}

}
