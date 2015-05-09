package com.k934.gameoflife;

/**
 * Created by Nikolay on 24.04.2015.
 */
import android.content.Context;

public class Life {

    public static final int CELL_SIZE = 32; //размер клетки
    public static final int WIDTH = 1080 / CELL_SIZE; //ширина / размер клетки
    public static final int HEIGHT = 1500 / CELL_SIZE;

    private int [][] tempGrid;
    private static final int[][] _lifeGrid = new int[HEIGHT][WIDTH];

    private Context _context;

    public Life(Context context) {
        this._context = context;
        initializeGrid();
    }

    public static int[][] getGrid() {
        return _lifeGrid; //вернуть сетку
    }

    //public void scangrid()
    //{
    //    tempGrid = Position.scanSet;
    //}

    public void initializeGrid() {
        resetGrid(_lifeGrid);

       /* _lifeGrid[8][(WIDTH / 2) - 1] = 1;
        _lifeGrid[8][(WIDTH / 2) + 1] = 1;
        _lifeGrid[9][(WIDTH / 2) - 1] = 1;
        _lifeGrid[9][(WIDTH / 2) + 1] = 1;
        _lifeGrid[10][(WIDTH / 2) - 1] = 1;
        _lifeGrid[10][(WIDTH / 2)] = 1;
        _lifeGrid[10][(WIDTH / 2) + 1] = 1;
        _lifeGrid[11][(WIDTH / 2) + 1] = 1;
        _lifeGrid[12][(WIDTH / 2) + 1] = 1;
        _lifeGrid[1][2] = Position.LifeSet[1][1];
        _lifeGrid[2][3] = 1;
        _lifeGrid[3][1] = 1;
        _lifeGrid[3][2] = 1;
        _lifeGrid[3][3] = 1;

        _lifeGrid[11][12] = 1;
        _lifeGrid[12][13] = 1;
        _lifeGrid[13][11] = 1;
        _lifeGrid[13][12] = 1;
        _lifeGrid[13][13] = 1;*/

        for (int h = 0; h < 5; h++) {
            for (int w = 0; w < 5; w++) {
                _lifeGrid[h+1][w+1] = Position.LifeSet[h][w];
            }
        }

    } //инициализация сетки, начальные параметры

    /*public int returnSpeed()
    {
       return Integer.parseInt(SettingsActivity
               .getAnimationSpeed(this._context));
    };*/

    public void generateNextGeneration() {
        int neighbours;
        //Правила игры
        int minimum = Integer.parseInt(SettingsActivity
                .getMinimumVariable(this._context));
        int maximum = Integer.parseInt(SettingsActivity
                .getMaximumVariable(this._context));
        int spawn = Integer.parseInt(SettingsActivity
                .getSpawnVariable(this._context));

        int[][] nextGenerationLifeGrid = new int[HEIGHT][WIDTH]; //временная сетка

        for (int h = 0; h < HEIGHT; h++) {
            for (int w = 0; w < WIDTH; w++) {
                neighbours = calculateNeighbours(h, w);

                if (_lifeGrid[h][w] != 0) {
                    if ((neighbours >= minimum) && (neighbours <= maximum)) {
                        nextGenerationLifeGrid[h][w] = neighbours;
                    }
                } else {
                    if (neighbours == spawn) {
                        nextGenerationLifeGrid[h][w] = spawn;
                    }
                }
            }
        }
        copyGrid(nextGenerationLifeGrid, _lifeGrid); //временная сетка -> основная сетка
    }

    private void resetGrid(int[][] grid) {
        for (int h = 0; h < HEIGHT; h++) {
            for (int w = 0; w < WIDTH; w++) {
                grid[h][w] = 0;
            }
        }
    }

    //считаем соседей клетки
    //todo
    private int calculateNeighbours(int y, int x) {
        int total = (_lifeGrid[y][x] != 0) ? -1 : 0; // if-then-else
        for (int h = -1; h <= +1; h++) {
            for (int w = -1; w <= +1; w++) {
                if (_lifeGrid[(HEIGHT + (y + h)) % HEIGHT][(WIDTH + (x + w))
                        % WIDTH] != 0) {
                    total++;
                }
            }
        }
        return total;
    }
    //скопировать сетку
    private void copyGrid(int[][] source, int[][] destination) {
        for (int h = 0; h < HEIGHT; h++) {
            for (int w = 0; w < WIDTH; w++) {
                destination[h][w] = source[h][w];
            }
        }
    }
}
