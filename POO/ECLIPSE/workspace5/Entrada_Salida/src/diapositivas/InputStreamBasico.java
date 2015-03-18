package diapositivas;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringBufferInputStream;

public class InputStreamBasico {

	public static void main(String[] args) {
		String frase = "esto es una frase";
		StringBufferInputStream in = new StringBufferInputStream(frase);
		int c;
		/*System.out.println(c);
		System.out.println((char)c);*/
		while((c=in.read())!=-1) System.out.println(c+" "+(char)c );
		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String frase2 = "esto es una frase con una ñ";
		byte[] arrayBytes = frase2.getBytes();
		System.out.println(arrayBytes[0]+" "+(char)arrayBytes[0]);
		
		ByteArrayInputStream in2 = new ByteArrayInputStream(arrayBytes, 2, arrayBytes.length);
		int c2;
		while((c2=in2.read())!=-1) System.out.println(c2+" "+(char)c2 );
	}

}
