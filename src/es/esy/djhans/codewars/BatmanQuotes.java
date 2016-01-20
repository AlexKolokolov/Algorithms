package es.esy.djhans.codewars;

/**
 * Created by Administrator on 22.11.2015.
 */
public class BatmanQuotes {

    public static String getQuote(String[] quotes, String hero){
        String returnString = "";
        //FILL ME IN
        String[] arr = hero.split("");
        String name = "";
        int num = -1;
        for (String ch : arr) if (ch.matches("[0-9]")) num = Integer.parseInt(ch);
        switch (arr[0]) {
            case "B":
                name = "Batman: ";
                break;
            case "R":
                name = "Robin: ";
                break;
            case "J":
                name = "Joker: ";
                break;
        }
        returnString = name + quotes[num];
        return returnString;
    }

    public static void main(String[] args) {
        String[] quotes = { "Quote Hidden in example test",
                "Holy haberdashery, Batman!",
                "Quote Hidden in example test"
        };

        System.out.println(getQuote(quotes, "Rob1n"));
    }
}
