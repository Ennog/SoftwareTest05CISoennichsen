/**
 * Created by milena on 04/11/14.
 */
public class FizzBuzz {
    public String antwort(int i) {

        String ergebnis="";
        if (i%3 == 0){
            ergebnis = "fizz";
        }else if (i%5 == 0) {
	    ergebnis = "buzz";
	}
        return ergebnis;
    }
}
