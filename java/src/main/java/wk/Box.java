package wk;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class Box {
    public static void main(String args[]) {
        try (PDDocument document = PDDocument.load(new File("resource/Pdf.pdf"))) {

            if (!document.isEncrypted()) {

                PDFTextStripper tStripper = new PDFTextStripper();
                String pdfFileInText = tStripper.getText(document);
                String lines[] = pdfFileInText.split("\\r?\\n");
                for (String line : lines) {
                    System.out.println(line);
                }

            }
        } catch (IOException e) {
            System.err.println("Exception while trying to read pdf document - " + e);
        }
    }
}