import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class sette_LeggereTesto {
	public static void main(String args[]) throws IOException {

	      //Cerco il il file e creo un documento che carichi il file al suo interno
	      File file = new File("C:/Users/amman/Desktop/my_doc2.pdf");
	      PDDocument document = PDDocument.load(file);

	      //Instanza della classe PDFTextStripper
	      PDFTextStripper pdfStripper = new PDFTextStripper();

	      //Inserisco nella variabile di tipo stringa il testo letto
	      String text = pdfStripper.getText(document);
	      System.out.println(text);

	      //Chiudo il documento
	      document.close();

	   }
}
