package org.yunus;


import zemberek.morphology.TurkishMorphology;
import zemberek.morphology.analysis.SentenceAnalysis;
import zemberek.morphology.analysis.SentenceWordAnalysis;
import zemberek.morphology.analysis.SingleAnalysis;

public class a {
    public static void main(String[] args) {
        TurkishMorphology morphology = TurkishMorphology.createWithDefaults();
        String sentence = "Ayının kürkü kahverengidir";
        SentenceAnalysis analysis = morphology.analyzeAndDisambiguate(sentence);

        System.out.println("Cümle :" + sentence);
        for (SentenceWordAnalysis wordAnalysis : analysis){
            SingleAnalysis singleAnalysis = wordAnalysis.getBestAnalysis();
            System.out.println(wordAnalysis.getWordAnalysis().getInput());
            System.out.println("Stem = "+ wordAnalysis.getBestAnalysis().getStem());
            System.out.println("Stem = "+ singleAnalysis.getDictionaryItem().lemma);
            System.out.println();
        }
    }
}
