package com.bh.baseballGame;

import java.util.Random;
import java.util.Scanner;

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
        System.out.println();
    }

    //input 3 number
    public void inputNumber(){
        int[] no = new int[3];
        // user input 3 number
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Input 3 digit: ");
            int inputNo = sc.nextInt();

            int idx = 0;
            boolean success = true;
            // input number which is 3 digit needs to be seperated
            // ex) inputNo = 123, n=3 inputNo=12 / inputNo=12, n=2, inputNo=1 / inputNo=1, n=1, inputNo=0
            for (int i = 0; i <= idx; i++) {
                if (inputNo > 0) {
                    int n = inputNo % 10;
                    inputNo = inputNo / 10;

                    boolean duplicated = false;
                    for (int j = 0; j < idx; j++) {
                        if (no[j] == n) {
                            duplicated = true;
                            break;
                        }
                    }

                    if (duplicated) {
                        System.out.println("you have to enter 3 different digit");
                        success = false;
                        break;
                    }

                    if (idx >= 3) {
                        System.out.println("you have enter to much number");
                        success = false;
                        break;
                    }

                    no[idx] = n;
                    System.out.println("idx : " + idx);
                    idx++;
                }
            }
            if (success){
            break;
            }
        }
            int temp = no[0];
            no[0] = no[2];
            no[2] = temp;

                for (int k = 0; k < 3; k++) {
                    System.out.print(no[k] + " ");
            }
            // no[0],no[3] = no[3], no[1];
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
