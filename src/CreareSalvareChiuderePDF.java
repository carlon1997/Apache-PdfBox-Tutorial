/*Esercizio 1
 * Creazione di un foglio PDF:
 * importo la classe PDDocument
 * 
 */

import java.io.IOException; 
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class CreareSalvareChiuderePDF {
	public static void main (String args[]) throws IOException {
	       
	      //Creazione dell'oggetto Documento PDF, senza pagine (devo importare PDDocument) 
	      PDDocument document = new PDDocument();  
	      
	      //Creo una pagina per il mio documento. (devo importare PDPage)
	      PDPage my_page = new PDPage();
	      //Con il metodo AddPage aggiungo pagine al mio documento
	      document.addPage(my_page);
	      
	      
	      //Per creare più pagine bianche all'interno del documento:
	      for (int i=0; i<10; i++) {
	          //Creo pagine bianche 
	          PDPage blankPage = new PDPage();

	          //Aggiungo le pagine bianche al mio documento
	          document.addPage( blankPage );
	       } 
	      
	       
	      //Salvare il documento
	      document.save("C:/Users/amman/Desktop/my_doc.pdf");
	         
	      System.out.println("PDF created");  
	    
	      //Chiusura del documento  
	      document.close();

	   }  
}
