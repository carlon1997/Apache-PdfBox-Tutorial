import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
public class Esercizi {
	
	public static void main(String args[]) throws IOException {

	      //Cerco il il file e creo un documento che carichi il file al suo interno
	      File file = new File("C:/Users/amman/Desktop/LM21597_2014.pdf");
	      PDDocument document = PDDocument.load(file);

	      //Instanza della classe PDFTextStripper
	      PDFTextStripper pdfStripper = new PDFTextStripper();
	      
	      //Inserisco nella variabile di tipo stringa il testo letto
	      String text = pdfStripper.getText(document);
	      
	     
	      String expText;
	      //Ottengo la posizione della stringa "Numero cliente più il numero"
	      int x1 = text.indexOf("Numero cliente");
	      int x2 = text.indexOf("Fattura per la fornitura");
	      
	      expText = text.substring(x1, x2);
	      System.out.println(expText);
	      
	      
	      
	      
	      
	      System.out.println(text + "Il valore di x1 è: " +x1 + " " + x2);

	      //Chiudo il documento
	      document.close();

	   }

}
