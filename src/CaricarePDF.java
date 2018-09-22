//Esercizio 2
//Caricare un file PDF e aggiungere un foglio
import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument; 
import org.apache.pdfbox.pdmodel.PDPage;

public class CaricarePDF {
	public static void main(String args[]) throws IOException {
		   
	      //Caricare un documento esistente (import java.io.File)
	      File file = new File("C:/Users/amman/Desktop/PDFTest.pdf"); 
	      PDDocument document = PDDocument.load(file); 
	        
	      System.out.println("PDF Caricato"); 
	        
	      //Aggiungo una pagina bianca al FILE 
	      document.addPage(new PDPage());  

	      //Salvo il nuovo documento
	      document.save("C:/Users/amman/Desktop/my_doc.pdf");
	      System.out.println("PDF Salvato"); 

	      //Chiudo il documento 
	      document.close(); 
	        
	   }

	
	
	
	
}
