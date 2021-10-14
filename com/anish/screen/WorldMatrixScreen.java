package com.anish.screen;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.security.Principal;

import com.anish.calabashbros.MatrixBubbleSorter;
import com.anish.calabashbros.World;
import com.anish.calabashbros.YouSei;

import asciiPanel.AsciiPanel;

public class WorldMatrixScreen implements Screen {
    private World world;
    private YouSei[][] youseis;
    String[] sortSteps;

    public WorldMatrixScreen() {
        world = new World();

        youseis = new YouSei[8][8];

        youseis[4][4] = new YouSei(new Color(7, 7, 21), 0, world);
        youseis[2][0] = new YouSei(new Color(40, 21, 22), 1, world);
        youseis[3][0] = new YouSei(new Color(53, 22, 27), 2, world);
        youseis[5][0] = new YouSei(new Color(43, 7, 48), 3, world);
        youseis[4][0] = new YouSei(new Color(13, 24, 85), 4, world);
        youseis[6][6] = new YouSei(new Color(24, 29, 66), 5, world);
        youseis[1][5] = new YouSei(new Color(7, 43, 21), 6, world);
        youseis[3][3] = new YouSei(new Color(29, 33, 21), 7, world);
        youseis[5][7] = new YouSei(new Color(50, 50, 50), 8, world);
        youseis[3][6] = new YouSei(new Color(134, 44, 14), 9, world);
        youseis[7][4] = new YouSei(new Color(149, 43, 14), 10, world);
        youseis[6][0] = new YouSei(new Color(125, 3, 93), 11, world);
        youseis[2][2] = new YouSei(new Color(8, 46, 198), 12, world);
        youseis[7][0] = new YouSei(new Color(29, 70, 143), 13, world);
        youseis[6][1] = new YouSei(new Color(3, 105, 3), 14, world);
        youseis[6][3] = new YouSei(new Color(67, 81, 0), 15, world);
        youseis[2][7] = new YouSei(new Color(102, 102, 102), 16, world);
        youseis[1][7] = new YouSei(new Color(194, 90, 19), 17, world);
        youseis[0][0] = new YouSei(new Color(189, 53, 34), 18, world);
        youseis[7][3] = new YouSei(new Color(168, 32, 134), 19, world);
        youseis[6][4] = new YouSei(new Color(65, 74, 221), 20, world);
        youseis[1][3] = new YouSei(new Color(29, 111, 196), 21, world);
        youseis[2][1] = new YouSei(new Color(23, 127, 23), 22, world);
        youseis[5][6] = new YouSei(new Color(94, 110, 0), 23, world);
        youseis[2][5] = new YouSei(new Color(144, 144, 144), 24, world);
        youseis[0][5] = new YouSei(new Color(255, 139, 30), 25, world);
        youseis[7][1] = new YouSei(new Color(232, 99, 63), 26, world);
        youseis[2][3] = new YouSei(new Color(203, 78, 170), 27, world);
        youseis[0][3] = new YouSei(new Color(91, 105, 255), 28, world);
        youseis[7][2] = new YouSei(new Color(73, 156, 218), 29, world);
        youseis[0][1] = new YouSei(new Color(55, 165, 55), 30, world);
        youseis[5][2] = new YouSei(new Color(122, 142, 11), 31, world);
        youseis[3][5] = new YouSei(new Color(185, 185, 185), 32, world);
        youseis[4][5] = new YouSei(new Color(254, 175, 37), 33, world);
        youseis[7][5] = new YouSei(new Color(253, 120, 84), 34, world);
        youseis[7][7] = new YouSei(new Color(229, 104, 196), 35, world);
        youseis[7][6] = new YouSei(new Color(114, 132, 255), 36, world);
        youseis[5][1] = new YouSei(new Color(85, 183, 255), 37, world);
        youseis[4][1] = new YouSei(new Color(81, 206, 81), 38, world);
        youseis[3][4] = new YouSei(new Color(159, 179, 48), 39, world);
        youseis[0][2] = new YouSei(new Color(209, 209, 209), 40, world);
        youseis[0][7] = new YouSei(new Color(255, 201, 74), 41, world);
        youseis[1][2] = new YouSei(new Color(255, 153, 125), 42, world);
        youseis[3][2] = new YouSei(new Color(252, 127, 219), 43, world);
        youseis[5][5] = new YouSei(new Color(145, 161, 255), 44, world);
        youseis[1][6] = new YouSei(new Color(117, 203, 255), 45, world);
        youseis[0][4] = new YouSei(new Color(125, 229, 125), 46, world);
        youseis[4][6] = new YouSei(new Color(185, 205, 74), 47, world);
        youseis[2][4] = new YouSei(new Color(225, 225, 225), 48, world);
        youseis[5][3] = new YouSei(new Color(255, 221, 97), 49, world);
        youseis[3][1] = new YouSei(new Color(255, 179, 158), 50, world);
        youseis[1][4] = new YouSei(new Color(255, 157, 229), 51, world);
        youseis[6][7] = new YouSei(new Color(159, 178, 255), 52, world);
        youseis[2][6] = new YouSei(new Color(141, 218, 255), 53, world);
        youseis[0][6] = new YouSei(new Color(153, 242, 153), 54, world);
        youseis[1][1] = new YouSei(new Color(205, 225, 83), 55, world);
        youseis[3][7] = new YouSei(new Color(244, 244, 244), 56, world);
        youseis[6][2] = new YouSei(new Color(255, 241, 148), 57, world);
        youseis[4][3] = new YouSei(new Color(255, 208, 195), 58, world);
        youseis[4][7] = new YouSei(new Color(255, 175, 234), 59, world);
        youseis[5][4] = new YouSei(new Color(192, 203, 255), 60, world);
        youseis[4][2] = new YouSei(new Color(180, 226, 255), 61, world);
        youseis[1][0] = new YouSei(new Color(195, 249, 195), 62, world);
        youseis[6][5] = new YouSei(new Color(232, 252, 121), 63, world);

        for (int i = 0; i < 8; ++i)
            for (int j = 0; j < 8; ++j)
                world.put(youseis[i][j], 12 + 2 * i, 2 + 2 * j);

        MatrixBubbleSorter<YouSei> mb = new MatrixBubbleSorter<YouSei>();
        mb.load(youseis);
        mb.sort();

        //System.out.println(mb.getPlan());
        sortSteps = this.parsePlan(mb.getPlan());
        
    }

    @Override
    public void displayOutput(AsciiPanel terminal) {

        for (int x = 0; x < World.WIDTH; x++) {
            for (int y = 0; y < World.HEIGHT; y++) {

                terminal.write(world.get(x, y).getGlyph(), x, y, world.get(x, y).getColor());

            }
        }
    }

    int i = 0;

    @Override
    public Screen respondToUserInput(KeyEvent key) {

        if (i < this.sortSteps.length) {
            this.execute(youseis, sortSteps[i]);
            i++;
        }

        return this;
    }

    private String[] parsePlan(String plan) {
        return plan.split("\n");
    }

    private void execute(YouSei[][] youseis, String step) {
        String[] couple = step.split("<->");
        getYouSeiByRank(youseis, Integer.parseInt(couple[0]))
                .swap(getYouSeiByRank(youseis, Integer.parseInt(couple[1])));
    }

    private YouSei getYouSeiByRank(YouSei[][] youseis, int rank) {
        for (YouSei[] row : youseis)
            for (YouSei yousei : row) {
                if (yousei.getRank() == rank) {
                    return yousei;
                }
            }
        return null;
    }
}
