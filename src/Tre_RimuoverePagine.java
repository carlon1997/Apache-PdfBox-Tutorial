import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;

public class Tre_RimuoverePagine {
	public static void main(String args[]) throws IOException {

	      //Caricando un PDF esistente
	      File file = new File("C:/Users/amman/Desktop/PDFTest.pdf");
	      PDDocument document = PDDocument.load(file);
	       
	      //Acquisizione numero delle pagine (getNumberOfPages mi restituisce il numero)
	      int numeroPagine= document.getNumberOfPages();
	      System.out.println("Il documento contiene: " + numeroPagine + " pagine");
	       
	      //Rimozione della pagina indicata tra parentesi 
	      //Gli indici sono come quelli degli array, partono da 0, per cancellare 
	      //la prima pagina scriverò 0.
	      document.removePage(0);
	      System.out.println("Pagina rimossa");
	      
	      numeroPagine= document.getNumberOfPages();
	      System.out.println("Adesso contiene: " + numeroPagine + " pagine");
	      
	      
	      //Per togliere più pagine:
	      for(int iter = 0; iter <= 14; iter ++) {
	    	  document.removePage(0);
	      }
	      numeroPagine= document.getNumberOfPages();
	      System.out.println("Ne ho cancellate un bel po'.\nAdesso contiene: " + numeroPagine + " pagine");
	      

	      //Salvo il documento
	      document.save("C:/Users/amman/Desktop/my_doc.pdf");

	      //Chiusura documento
	      document.close();

	   }
}
