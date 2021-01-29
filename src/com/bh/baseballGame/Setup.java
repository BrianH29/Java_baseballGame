package com.bh.baseballGame;

import java.util.Random;

public class Setup {

    //random3 number
    public void randomNumber() {
        int[] no = new int[3];
        Random r = new Random();

        for(int i=0; i<3; i++){
            while(true) {
                int rand = r.nextInt(10) + 1;

                //checking duplicate
                boolean duplicated = false;
                for(int j=0; j<3; j++){
                    if(no[j] == rand){
                        duplicated = true;
                        break;
                    }
                }

                if(!duplicated){
                    no[i] = rand;
                    break;
                }

            }
        }
        for(int i=0; i<3; i++){
            System.out.print(no[i] + " ");
        }


    }

    //input 3 number
    public void inputNumber(){

    }

    //compare random & input no
    public void compareNumber(){

    }

    //print result of the compare
    public void printResult(){

    }

    //show result of the game
    public void endGame(){

    }
}
