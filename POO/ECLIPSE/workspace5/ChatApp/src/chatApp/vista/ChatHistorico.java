package chatApp.vista;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

import chatApp.modelo.Mensaje;

public class ChatHistorico extends JTextPane {
	private StyledDocument doc;
	private Style estiloAutor, estiloTexto;

	public ChatHistorico() {
		setEditable(false);
		doc = getStyledDocument();
		creaEstilos(doc);
	}

	protected void creaEstilos(StyledDocument doc) {
		Style def = StyleContext.getDefaultStyleContext().getStyle(
				StyleContext.DEFAULT_STYLE);

		estiloTexto = doc.addStyle("texto", def);
		StyleConstants.setFontFamily(def, "SansSerif");
		StyleConstants.setBold(def, true);

		estiloAutor = doc.addStyle("autor", estiloTexto);
		StyleConstants.setItalic(estiloAutor, true);
		StyleConstants.setForeground(estiloAutor, Color.red);
	}

	public void insertaMensaje(Mensaje msg) {
		String autor = "[" + msg.getUsuarioOrigen().getNombre() + " "
				+ msg.getIdMensaje() + "]: ";
		String texto = "" + msg.getTexto() + "\n";

		try {
			doc.insertString(doc.getLength(), autor, estiloAutor);
			doc.insertString(doc.getLength(), texto, estiloTexto);
		} catch (BadLocationException e) {
		}
	}

	public void insertaMensajes(ArrayList<Mensaje> mensajes) {
		for (Mensaje msg : mensajes) {
			insertaMensaje(msg);
		}
	}
}
