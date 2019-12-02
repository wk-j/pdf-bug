using System;
using System.IO;
using iTextSharp.text.pdf;
using iTextSharp.text.pdf.parser;

namespace Pdf {
    class Program {
        public static string GetTextFromAllPages(String pdfPath) {
            PdfReader reader = new PdfReader(pdfPath);
            StringWriter output = new StringWriter();

            for (int i = 1; i <= reader.NumberOfPages; i++)
                output.WriteLine(PdfTextExtractor.GetTextFromPage(reader, i, new SimpleTextExtractionStrategy()));

            return output.ToString();
        }
        static void Main(string[] args) {
            var text = GetTextFromAllPages("resource/Pdf.pdf");
            Console.WriteLine(text);
        }
    }
}
