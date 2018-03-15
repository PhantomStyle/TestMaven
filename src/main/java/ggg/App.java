package ggg;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        app.getWords(args);
    }

    public Map getWords(String... words){
        Map<String, Integer> wordMap = new HashMap<>();
        int i = 0;
        for(String word : words){
            word = word.trim().replaceAll("\\p{Punct}", "");
            if(!wordMap.containsKey(word)){
                wordMap.put(word, 1);
            }
            else {
                wordMap.put(word, wordMap.get(word) + 1);
            }

        }
        return wordMap;
    }
}
