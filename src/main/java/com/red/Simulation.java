package com.red;


public class Simulation {

    int width;
    int height;
    int[][] board;
    int cou = 0;

    public Simulation(int width, int height) {
        this.width = width;
        this.height = height;
        this.board = new int[width][height];
    }

    public boolean isAlive(int x,int y){
        if(this.board[x][y] == 1) return true;
        else return false;
    }

    public int[] rules(int index){
        int[] rules = new int[8];
            Integer.toBinaryString(index);
            String result = String.format("%8s",Integer.toBinaryString(index)).replaceAll(" ","0");
            for (int j = 0; j < 8; j++){
                rules[j] = result.charAt(j) - '0';
            }
            return rules;

    }

    public void step(int index) {
        int[] rule = rules(index);
        int[] binary = new int[3];
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<width;i++){
            if(i==0) binary[0] = this.board[width-1][cou];
            else binary[0] = this.board[i-1][cou];
            binary[1] = this.board[i][cou];
            if(i==width-1) binary[2] = this.board[0][cou];
            else binary[2] = this.board[i+1][cou];
            for(int j=0;j<3;j++) sb.append(binary[j]);
            this.board[i][cou+1] = rule[((Integer.parseInt(sb.toString(),2))-7)*-1];
            sb.delete(0,sb.length());
        }
        cou++;
    }

    public void reset(){
        for(int i =0;i<width;i++){
            for(int j = 0;j<height;j++){
                this.board[i][j] = 0;
            }
        }
        cou=0;
    }

    public void set(int x, int y, int state) {
        this.board[x][y] = state;

    }


}