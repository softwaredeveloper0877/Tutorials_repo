package org.yunus.Algorithms;

public class SearchAlgorithms {
    public void breathFirstSearch(){
        String[][] honda = {{"Araba","Civic","Direksiyon"},{"Motosiklet","CBR125","Gidon"},{"Agac motoru", "GX630", "Zincir"}};
        int j = 0;
        System.out.println("Yayilim öncelikli algoritma basladi");
        for (int i = 0; i<honda.length; i++){
            System.out.println(honda[i][j]);
            if (i == (honda.length - 1) && j < (honda.length - 1)){
                System.out.println("Depth increased (Derinlik arttırıldı)");
                i = -1;
                j++;
            }
        }
    }

    public void deepFirstSearch(){
        String[][] suzuki = {{"Araba","Vitara","Direksiyon"},{"Motosiklet","Hayabusa","Gidon"},{"Tekne", "DF300B", "Dümen"}};
        for (int i = 0; i<suzuki.length; i++){
            for (int j = 0; j<suzuki[i].length; j++){
                System.out.println(suzuki[i][j]);
            }
        }
    }
    public static void main (String[] args){
        SearchAlgorithms searchAlgorithms = new SearchAlgorithms();
        searchAlgorithms.breathFirstSearch();
        System.out.println("Breadth first search is finished");
        searchAlgorithms.deepFirstSearch();
        System.out.println("Deep first search is finished");
    }
}
