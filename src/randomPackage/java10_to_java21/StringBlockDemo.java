package randomPackage.java10_to_java21;

import netscape.javascript.JSObject;

public class StringBlockDemo {

    public static void main(String[] args) {

        String htmlData1 = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<meta charset=\"utf-8\">\n" +
                "\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "\t<title></title>\n" +
                "</head>\n" +
                "<body>\n" +
                "</body>\n" +
                "</html>";

        //System.out.println(htmlData1);

        String htmlData2 = """
                <!DOCTYPE html>
                <html>
                <head>
                	<meta charset="utf-8">
                	<meta name="viewport" content="width=device-width, initial-scale=1">
                	<title></title>
                </head>
                <body>            
                </body>
                </html>
                """;
        System.out.println(htmlData2);

        String jsonData = """
                {
                	"id": "0001",
                	"type": "donut",
                	"name": "Cake",
                	"ppu": 0.55,
                	"batters":
                		{
                			"batter":
                				[
                					{ "id": "1001", "type": "Regular" },
                					{ "id": "1002", "type": "Chocolate" },
                					{ "id": "1003", "type": "Blueberry" },
                					{ "id": "1004", "type": "Devil's Food" }
                				]
                		},
                """;


    }
}
