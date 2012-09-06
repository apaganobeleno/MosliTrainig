/**
 * Created with IntelliJ IDEA.
 * User: antoniopagano
 * Date: 9/6/12
 * Time: 4:45 PM
 */
public class FizzBuzz {

  public static void main(String[] args) {

    Integer[] selectedNumbers = new Integer[]{ 3,5,7,9 };
    String[]  numbersMessages = new String[]{"Fizz", "Buzz", "Caro", "Mosli" };


    for (int numberToAnalize = 1; numberToAnalize <= 1000; numberToAnalize++) {
      String fizzBuzzMessage = getFixBuzzMessage( numberToAnalize ,selectedNumbers,numbersMessages );

      if ( fizzBuzzMessage == "" ) {
        fizzBuzzMessage = String.valueOf(numberToAnalize);
      }

      System.out.println(fizzBuzzMessage);
    }


  }

  private static String getFixBuzzMessage( Integer number, Integer[] selectedNumbers, String[] messages ){
    String resultMessage = "";

    for (int selectedNumberIndex = 0; selectedNumberIndex < selectedNumbers.length; selectedNumberIndex++) {
      if( number % selectedNumbers[selectedNumberIndex] == 0 ){
        resultMessage = resultMessage + messages[selectedNumberIndex];
      }
    }

    return resultMessage;
  }



}
