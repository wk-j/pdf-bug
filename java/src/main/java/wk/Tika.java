package wk;

import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.parser.pdf.PDFParserConfig;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.ContentHandler;

import java.io.*;

public class Tika {

    public static String extractTikaText(String file) throws Exception {
        InputStream is = null;
        ContentHandler contentHandler = null;
        try {
            is = new FileInputStream(file);
            contentHandler = new BodyContentHandler(-1);

            Metadata metadata = new Metadata();

            PDFParserConfig config = new PDFParserConfig();
            // config.setSortByPosition(true);
            // config.setEnableAutoSpace(true);

            PDFParser pdfParser = new PDFParser();
            pdfParser.setPDFParserConfig(config);

            ParseContext context = new ParseContext();

            pdfParser.parse(is, contentHandler, metadata, context);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            if (is != null)
                try {
                    is.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
        }
        return contentHandler.toString();
    }

    public static void main(String[] args) throws Exception {
        String text = extractTikaText("resource/Pdf.pdf");
        System.out.println(text);
    }
}