package bridgeprinter;

import java.util.List;

public class HTMLFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("<h1>" + header + "</h1>");
        builder.append("<ul>");
        for (Detail detail : details) {
            builder.append("<li>" + detail.getLabel() + ": " + detail.getValue() + "</li>");
        }
        builder.append("</ul>");
        return builder.toString();
    }
}
