
/**
 * This program is designed to evaluate the input string and output a different greeting accordingly
 *
 * @author (Matthew Ascone)
 * @version (2/5/20)
 */
public class AliceAndBobEngine
{
    String result;

    AliceAndBobEngine(){
        result = "";
    }

    //HINT: LOOK AT THE TESTS TO SEE WHAT IS EXPECTED FOR DIFFERENT CONDITIONS
    public String evaluateAliceOrBob(String input)
    {
    if (input.equals("Bob")) {
      result = "Hello Bob";
    } else if (input.equals("Alice")) {
      result = "Hello Alice";
    } else {
      result = "I DON'T KNOW YOU, YOU ARE SCARY";
    }
        return result;
    }
}
