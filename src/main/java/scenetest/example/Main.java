package scenetest.example;
import java.io.PushbackReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;

class Scanner {


    enum TOKEN {
        SCANEOF, ID, CONSTINT, VAR, OUTPUT, INITIALIZE, EQUALS, IF, THEN, ENDIF, COMPUTE, PLUS;
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> reservedWords = Arrays.asList("var", "output", "initialize", "if", "then", "endif", "compute");
        PushbackReader reader = new PushbackReader(new StringReader(""));
        StringBuilder builder = new StringBuilder();


        }
    }
