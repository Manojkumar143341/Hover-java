import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PDFTextExtractor {
    public static void main(String[] args) {
        // Replace with your PDF file path
        String pdfPath = "example.pdf";

        try {
            // Load the PDF file
            PDDocument document = PDDocument.load(new File(pdfPath));

            // Create PDFTextStripper
            PDFTextStripper pdfStripper = new PDFTextStripper();

            // Extract text
            String text = pdfStripper.getText(document);

            // Print the text
            System.out.println("Extracted Text:\n" + text);

            // Close the document
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
