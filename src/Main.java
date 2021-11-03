import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        guessTheWord();

    }

    public static void guessTheWord(){

        Random random = new Random();
        String[] words =
                {
                        "apple", "orange", "lemon", "banana", "apricot", "avocado",
                        "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
                        "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                        "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
                };

        int expWrdIndex = random.nextInt(words.length);
        String expWord = words[expWrdIndex];
        System.out.println(("Загаданое слово " + expWord));

        String userWord ;
        Scanner scanner =  new Scanner(System.in);
        do
        {
            userWord = scanner.nextLine();
            if(userWord.equals(expWord)){
                System.out.println("Угадал!");
            }
            else {
                doAdvise(userWord,expWord);
            }
        }
        while (!(userWord.equals((expWord))));

    }
    static void doAdvise(String userWord, String expWord){
        String advise = "";
        for (int i = 0 ; i < 15 ; i++)
        {
            if(i>=userWord.length()|| i>= expWord.length()){
                advise += "€";
            }
            else if (userWord.charAt(i) == expWord.charAt(i))
            {
                advise += userWord.charAt(i);
        }
        else
        {
               advise += "€";
        }
    }
        System.out.println(advise);
    }
}
