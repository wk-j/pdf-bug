package wk;

import java.io.File;
import java.io.FileInputStream;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;

public class IText {

    public static void main(String[] args) throws Exception {
        FileInputStream inputstream = new FileInputStream(new File("resource/Pdf.pdf"));
        PdfReader reader = new PdfReader(inputstream);
        String line = PdfTextExtractor.getTextFromPage(reader, 1, new SimpleTextExtractionStrategy());
        // String line = PdfTextExtractor.getTextFromPage(reader, 1);
        System.out.println("iText Contents of the PDF :" + line);
    }
}
