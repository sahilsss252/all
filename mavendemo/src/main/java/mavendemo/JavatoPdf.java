package mavendemo;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class JavatoPdf {

	public static void main(String[] args) {
		Document document= new Document();
		try {
			PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream("D:/HelloWorld.pdf"));
			document.open();
			document.add(new Paragraph("This is the code to create pdf from java"));
			document.close();
			writer.close();
			
			
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}
}
