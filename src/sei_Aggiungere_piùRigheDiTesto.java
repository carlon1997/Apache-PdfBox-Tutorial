import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

/*Per aggiungere più righe a un PDF, è necessario impostare l'interlinea utilizzando 
 * il metodo setLeading () e passare alla nuova riga utilizzando il metodo newline () 
 * dopo aver terminato ogni riga
 */

public class sei_Aggiungere_piùRigheDiTesto {
	public static void main (String args[]) throws IOException {

	      //Carico un documento esistente
	      File file = new File("C:/Users/amman/Desktop/my_doc.pdf");
	      PDDocument document = PDDocument.load(file);
	      document.addPage(new PDPage()); 
	      
	    
	      PDPage page = document.getPage(3); //Indico la pagina dove scrivere
	      //Indico su quale documento e a quale pagina scrivere
	      PDPageContentStream contentStream = new PDPageContentStream(document, page);
	      
	      
	      contentStream.beginText(); //Inizia l'inserimento del teso
	      contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);	//Font e grandezza
	      contentStream.newLineAtOffset(25, 500);				//Imposto la posizione
	      
	      
	      contentStream.setLeading(14.5f);  //Imposto l'interlinea tra ogni rigo

	      String text1 = "Prima riga di testo";
	      String text2 = "Seconda riga di testo";
	      String text3 = "Terza riga di testo";

	      //Aggiungo il testo sottoforma di stringhe
	      contentStream.showText(text1);
	      contentStream.newLine();		//Vado a capo
	      contentStream.showText(text2);
	      contentStream.newLine();		//Vado a capo
	      contentStream.showText(text3);
	      
	     
	      contentStream.endText(); 	//Fine dell'inserimento del testo
	      System.out.println("Contenuto aggiunto");
	      contentStream.close(); 	//Chiudo l'inserimento
	      
	      document.save(new File("C:/Users/amman/Desktop/my_doc2.pdf"));//Salvo      
	      document.close();//Chiudo
	      
	}
}
