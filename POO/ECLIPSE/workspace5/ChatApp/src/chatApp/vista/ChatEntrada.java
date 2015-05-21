package chatApp.vista;

import java.awt.Toolkit;

import javax.swing.JTextPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

public class ChatEntrada extends JTextPane {
	private AbstractDocument abDoc;

	public ChatEntrada() {
		Document doc = getStyledDocument();
		if (doc instanceof AbstractDocument) {
			abDoc = (AbstractDocument) doc;
			abDoc.setDocumentFilter(new DocumentSizeFilter());
		}
	}
}

class DocumentSizeFilter extends DocumentFilter {

	private final int MAXIMO_NUMERO_CARACTERES = 45;

	@Override
	public void insertString(FilterBypass fb, int offset, String str,
			AttributeSet a) throws BadLocationException {

		if ((fb.getDocument().getLength() + str.length()) <= MAXIMO_NUMERO_CARACTERES)
			super.insertString(fb, offset, str, a);
		else
			Toolkit.getDefaultToolkit().beep();
	}

	@Override
	public void replace(FilterBypass fb, int offset, int length, String str,
			AttributeSet a) throws BadLocationException {

		if ((fb.getDocument().getLength() + str.length() - length) <= MAXIMO_NUMERO_CARACTERES)
			super.replace(fb, offset, length, str, a);
		else
			Toolkit.getDefaultToolkit().beep();
	}
}