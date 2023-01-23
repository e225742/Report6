package jp.ac.uryukyu.ie.e225742;
import java.util.Random;

public class Nannpure{
    int i, j, k, l, check = 0, count = 0, tmp;
    int a[][] = new int[9][9];
    Random rnd = new Random();
    int ran;
    boolean A = false;
    public void CompletionList(){
        while(A == false){
            A = true;
            for(i = 0; i < 9; i++)
            for(j = 0; j < 9; j++)
            a[i][j] = 0;
            count = 0;
            
            for(i = 0; i < 9; i++){
                for(j = 0; j < 9; j++){
                    ran = rnd.nextInt(9);
                    tmp = ran + 1;
                    check = 0;
                    
                    for(k = 0; k < j; k++)
                    if(a[i][k] == tmp)
                    check = 1;
                    for(k = 0; k < i; k++)
                    if(a[k][j] == tmp)
                    check = 1;

                    for(k = (i/3)*3; k < (i/3)*3+3; k++)
                    for(l = (j/3)*3; l < (j/3)*3+3; l++)
                    if(a[k][l] == tmp)
                    check = 1;

                    if(check == 0)
                    a[i][j] = tmp;
                    if(check == 1)
                    j--;

                    if(count > 50000){
                        A = false; break;
                    }
                    count++;
                }
                count = 0;
            }
        }
        System.out.println("完成表");
        for(i = 0; i < 9; i++){
            for(j = 0; j < 9; j++){
                if(a[i][j] < 10){
                    System.out.print(" ");
                }
                System.out.print(a[i][j]);
            }
            System.out.print("\n");
        }
    }
}
