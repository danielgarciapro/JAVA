package ejercicio3;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class FiltroCsv extends FileFilter{

	@Override
	public boolean accept(File f) {		//setfilefilter(new filtrcsv)
		// TODO Auto-generated method stub
		if (f.isDirectory()) {
            return true;
        }
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');
 
        if (i > 0 &&  i < s.length() - 1) {
            ext = s.substring(i+1).toLowerCase();
        }
        if (ext != null) {
            if (ext.equals("csv"))
                    return true;
           else {
                return false;
            }
        }
 
        return false;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Documento de texto separado por dos puntos (*.csv)";
	}

}
