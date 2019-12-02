package wk;

import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.ContentHandler;

import java.io.*;

public class T {

    public static String extractTikaText(String file) throws Exception {
        InputStream is = null;
        ContentHandler contenthandler = null;
        try {
            is = new FileInputStream(file);
            contenthandler = new BodyContentHandler(-1);
            Metadata metadata = new Metadata();
            PDFParser pdfparser = new PDFParser();
            pdfparser.parse(is, contenthandler, metadata, new ParseContext());
            // logger.info("PDF text extracted from " + file + "\n");

        } catch (Exception e) {
            // logger.info("Error in parsing with Apache Tika parser\n");
        } finally {
            if (is != null)
                try {
                    is.close();
                } catch (IOException e) {
                    // logger.info("Error in closing file with Apache Tika\n");
                }
        }
        return contenthandler.toString();

    }

    public static void main(String[] args) throws Exception {
        String text = extractTikaText("Pdf.pdf");
        System.out.println(text);
    }
}