/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torresdehanoi;

/**
 *
 * @author luis_
 */
public class TowersOfHanoi {
    private int totalDisk;
    
    
    public TowersOfHanoi(int disk){
        totalDisk=disk;
    }
    private void moveTower( int numDisks, int start, int end, int temp){
        if(numDisks==1){
            moveOneDisk(start, end);
        }else{
            moveTower(numDisks-1, start, temp, end);
            moveOneDisk(start, end);
            moveTower(numDisks-1, temp, end, start);
        }
    }
    
    public void solve(){
        moveTower(totalDisk, 1, 3 , 2);
    }
    private void moveOneDisk(int start, int end){
        System.out.println("Move one disk from" + start + "end" + end);
    }
}
