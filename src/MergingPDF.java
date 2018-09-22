import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.apache.pdfbox.pdmodel.PDDocument;
import java.io.File; 
import java.io.IOException;
import java.util.Scanner;

public class MergingPDF {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quanti documenti PDF vuoi unire?");
		int numberPDF = scan.nextInt();
		//Creo un array che possa contenere tutti i percorsi inseriti dei file.
		String [] path = new String[numberPDF];
		//Array che conterrà il percorso salvato del file
		File [] file = new File [numberPDF];
		//Creo un nuovo documento per ogni File
		PDDocument[] doc = new PDDocument[numberPDF];
		
		for (int iter = 0; iter < numberPDF; iter++) {
			System.out.printf("Inserisci il percorso e il nome del %d File: ",iter+1);
			path[iter] = scan.next();	//Ottiene il percorso del file
			file[iter] = new File (path[iter]);//Cerca il file nel percorso
			doc[iter]= PDDocument.load(file[iter]); //Carico nel documento il FILE PDF
		}
	     
	      //Creo l'oggetto della classe per unire i due pdf
	      PDFMergerUtility PDFmerger = new PDFMergerUtility();

	      //Inserisco la destinazione del File PDF finale
	      System.out.print("Inserisci la destinazione finale del File unito: ");
	      String finalPath = scan.next();
	      PDFmerger.setDestinationFileName(finalPath);

	      //Indico quali sono i documenti da unire
	      for(int iter = 0; iter < numberPDF; iter++) {
	    	  PDFmerger.addSource(file[iter]);
	      }

	      //Unisco i documenti
	      PDFmerger.mergeDocuments();

	      System.out.println("Documents merged");
	      //Chiudo i documenti
	      
	      for(int iter = 0; iter < numberPDF; iter++) {
	    	  doc[iter].close();
	      }
	      scan.close();
	   }
}
