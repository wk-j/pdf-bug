## Pdf

*Bug*

```bash
mvn -f java/pom.xml install
mvn -f java/pom.xml exec:java -D"exec.mainClass"="wk.Tika"
mvn -f java/pom.xml exec:java -D"exec.mainClass"="wk.Box"
```

*Ok*

```bash
dotnet run --project src/Pdf/Pdf.csproj
mvn -f java/pom.xml exec:java -D"exec.mainClass"="wk.IText"
```

## Resource

- https://github.com/rushdishams/PDFTitle/blob/master/src/com/sustainalytics/crawlerfilter/PDFtoText.java
- https://github.com/kusl/itextsharp/blob/master/tags/iTextSharp_5_4_5/src/core/iTextSharp/text/pdf/parser/LocationTextExtractionStrategy.cs
- https://github.com/kusl/itextsharp/blob/master/tags/iTextSharp_5_4_5/src/core/iTextSharp/text/pdf/parser/SimpleTextExtractionStrategy.cs
- https://stackoverflow.com/questions/24422681/itext-sharp-simpletextextractionstrategy