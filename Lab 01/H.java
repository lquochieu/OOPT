package com.devdaily.jdialogicon;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class H {
    public static void main(String[] args) {
        Image img = new ImageIcon(Foo.class.getResource("add.png")).getImage();
    JFrame f = new JFrame("The Frame");
    // option 1: it works if i set an image on the parent frame here
    //f.setIconImage(img);
    JDialog j = new JDialog(f);
    // option 2: it works if i set an image on the parent frame this way
    ((java.awt.Frame)j.getOwner()).setIconImage(img);
    j.setModal(true);
    j.setVisible(true);
    }
}