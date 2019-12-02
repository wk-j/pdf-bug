## Pdf

*Bug*

```bash
mvn -f java/pom.xml install
mvn -f java/pom.xml exec:java -D"exec.mainClass"="wk.T"
```

*Ok*

```bash
dotnet run --project src/Pdf/Pdf.csproj
mvn -f java/pom.xml exec:java -D"exec.mainClass"="wk.Program"
```

## Resource

- https://github.com/rushdishams/PDFTitle/blob/master/src/com/sustainalytics/crawlerfilter/PDFtoText.java