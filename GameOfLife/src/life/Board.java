/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package life;

import java.awt.Point;
import java.util.ArrayList;
/**
 *
 * @author Nathan
 */
public class Board {
    private int width, height;
    private boolean[][] cells;
    
    public Board(int width, int height){
        this.width = width;
        this.height = height;
        cells = new boolean[width][height];
        
    }
    
    public void clear(){
        cells = new boolean[width][height];
    }
    
    public boolean getCell(int x, int y){
        return cells[x][y];
        
    }
    
    public void makeCellLive(String name, int x, int y){
        cells[x][y] = true;
    }
    
        public ArrayList<Point>  getLiveCells(){
      
       ArrayList<Point>  liveCells = new ArrayList<>();

        for (int x = 0; x < width ; x++) {
            for (int y = 0; y < height; y++) {
                if (cells[x][y]) {
                    liveCells.add(new Point(x, y));
                    
                }
            }
        }
        return liveCells;
    }
}
