import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://mtuci.ru/");

        var parser = new Crawler();
        parser.startParsing(url, 2, 0);

        LinkedList<UrlDepthPair> result = parser.proccessed;

        result.forEach(urlDepthPair -> {
            System.out.println(
                    "URL is " + urlDepthPair.url +
                            " | depth: " + urlDepthPair.depth);
        });
    }
}
