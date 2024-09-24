public class Count {
    public static void main(String[] args) {
        //Simplify each count in its own array with index0 indicating the language.
        String[] englishCount = {"English:", "one", "two", "three", "four", "five"};
        String[] spanishCount = {"Spanish:", "uno", "dos", "tres", "quatro", "cinco"};
        String[] frenchCount = {"French:", "un", "deux", "trois", "quatre", "cinq"};

        //Create an array of arrays for each count
        String[][] languages = {englishCount, spanishCount, frenchCount};

        //Access outer array
        for (int i = 0; i < languages.length; i++) {
            //access inner array and cycle through each
            for (int j = 0; j < languages[i].length; j++) {
                //print each count on one line for each language
                System.out.print(languages[i][j] + " ");
            }
            //Each language will be on its own line
            System.out.println();
        }
    }
}