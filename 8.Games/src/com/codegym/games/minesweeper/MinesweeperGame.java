
package com.codegym.games.minesweeper;

import com.codegym.engine.cell.*;

public class MinesweeperGame extends Game {
    private static final int SIDE = 9;

    public class GameObject{
        public int x;
        public int y;

        GameObject (int x, int y) {
            this.x =SIDE;
            this.y=SIDE;
        }

    }

    @Override
    public void initialize() {
        // Here we perform all actions to initialize the game and its objects
        setScreenSize(SIDE, SIDE);



    }

}
