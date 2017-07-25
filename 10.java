import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReverseWords {

public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the string");
    String v = br.readLine();

    String rev = StringRev(v);

    System.out.println(rev);

}

private static String StringRev(String v) 
{

    char[] modString = new char[v.length()];

    for (int i = 0; i < v.length(); i++) 
    {
        modString[i] = v.charAt(s.length() - 1 - i);
    }

    v = v.copyValueOf(modString);
    String reverseWord = "";
    String eachWord;
    for (String part : v.split(" ")) 
    {
        eachWord = new StringBuilder(part).reverse().toString();
        reverseWord = reverseWord + eachWord + " ";
    }

    return reverseWord;

  }

}