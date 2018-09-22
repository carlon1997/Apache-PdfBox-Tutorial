import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class cinque_AggiungereTesto {
	public static void main (String args[]) throws IOException {

	      //Carico un documento esistente
	      File file = new File("C:/Users/amman/Desktop/my_doc.pdf");
	      PDDocument document = PDDocument.load(file);
	      document.addPage(new PDPage()); 
	      
	      //Ottengo la pagina dove scrivere
	      PDPage page = document.getPage(2);
	      
	   /*Con la classe PDpageContentStream posso inserire vari tipi di dati
	    * passo al costrutore di questa classe il documento e la pagina*/
	      PDPageContentStream contentStream = new PDPageContentStream(document, page);

	      //Per inserire del teso devo indicare l'inizio e la fine
	      contentStream.beginText(); 
	       
	      //Imposto il Font per lo stream del contenuto(import content stream e PDType1font)
	      //e la grandezza del carattere
	      contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);

	      //Imposto la posizione della riga di testo
	      contentStream.newLineAtOffset(25, 500);

	      String text = "Esempio su cosa si può aggiungere.";

	      /*Aggiungo il testo contenuto nella stringa, in questa maniera posso aggiungere
	       * solo una riga di testo, se dovessi eccedere, non vedrei la restante parte
	       */
	      contentStream.showText(text);      

	      //Fine dell'inserimento de testo
	      contentStream.endText();

	      System.out.println("Contenuto Aggiunto!");

	      //Closing the content stream
	      contentStream.close();

	      //Saving the document
	      document.save("C:/Users/amman/Desktop/my_doc2.pdf");

	      //Closing the document
	      document.close();
	   }
}
