* Structural Design Patterns with Java

* Bridge Design Pattern
There are two Domains - Movie and Book
1. The Printer abstract class defines print function
    - The function takes formatter interface as an argument calls formatter.format(header, details)
    - The MoviePrinter and BookPrinter can extend Printer and provide concrete implementations of header and details
2. The Formatter interface is completely decoupled with Domains and its associated printer
    - All the implementors of this interface have to do is how they treat header and details
    - For example PrintFormatter might simply output text, while HTMLFormatter may add html tags