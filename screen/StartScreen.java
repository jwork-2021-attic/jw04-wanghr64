/*
 * Copyright (C) 2015 Aeranythe Echosong
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package screen;

import asciiPanel.AsciiPanel;

/**
 *
 * @author Aeranythe Echosong
 */
public class StartScreen extends RestartScreen {

    @Override
    public void displayOutput(AsciiPanel terminal) {
        terminal.write("    __  __        _        ____      ____   ", 16, 3);
        terminal.write("   F  \\/  ]      /.\\      [__  '.   F ___J  ", 16, 4);
        terminal.write("  J |\\__/| L    //_\\\\     `--7 .'  J |___:  ", 16, 5);
        terminal.write("  | |`--'| |   / ___ \\     .'.'.'  | _____| ", 16, 6);
        terminal.write("  F L    J J  / L___J \\  .' (_(__  F L____: ", 16, 7);
        terminal.write(" J__L    J__LJ__L   J__LJ________LJ________L", 16, 8);
        terminal.write(" |__L    J__||__L   J__||________||________|", 16, 9);
        terminal.write("                                            ", 16, 10);
        terminal.write("..Press Enter to start..", 27, 14);
    }

}
