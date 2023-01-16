package jp.ac.uryukyu.ie.e225742;
import java.util.ArrayList;
//import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * ９×９のナンプレ完成表を作るクラス
 */
public class Nannpure{
    /**
     * ９マスに数字を入れた塊を９個用意する
     */
    ArrayList<Integer> list = new ArrayList<>();
    Set<Integer> integerSet = new HashSet<>();
    int i = 0, j = 0, x = 0, count = 0;
    int[][] num = new int[9][9];
    public void NannpureList(){
        for (i = 1; i <= 9; i++){
            list.add(i);
        }
    }
    public void CompletionList(){
        System.out.println("完成表");
        for (i = 0; i < 9; i++){
            for (j = 0; j < 9; j++){
                System.out.printf("%3d", num[i][j]);
            }
            System.out.println();
        }
        System.out.println("実行回数" + count + "回");
    }
}