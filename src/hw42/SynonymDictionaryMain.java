package hw42;

import java.util.ArrayList;
import java.util.List;


public class SynonymDictionaryMain {
    public static void main(String[] args) {

        SynonymDictionary task3 = new SynonymDictionary();

        //Task3.init(List.of("small","big")); //method to create init map, accept key with empty list

        //add synonyms to the map and create initial map
        SynonymDictionary.addSynonym("small","little");
        SynonymDictionary.addSynonym("small", "tiny");
        SynonymDictionary.addSynonym("small", "baby");

        //add synonyms to the map
        SynonymDictionary.addSynonym("big","great");
        SynonymDictionary.addSynonym("big", "large");
        SynonymDictionary.addSynonym("big", "magnificent");

        //print map
        SynonymDictionary.printMap();

        //return the list of synonyms for the selected word
        System.out.println("synonyms of 'small': " + SynonymDictionary.getSynonym("small"));

        //create the list of synonyms to replace/update synonyms for the word
        List<String> listSyn = new ArrayList<>(List.of("huge","wide","fat"));

        //update the list of synonyms
        SynonymDictionary.updateSynonyms("big", listSyn);
        SynonymDictionary.printMap();

        //remove a word(key) with all synonyms
        SynonymDictionary.removeWord("big");
        SynonymDictionary.printMap();

        //remove a synonym
        SynonymDictionary.removeSynonym("small", "baby");
        SynonymDictionary.printMap();



    }
}
