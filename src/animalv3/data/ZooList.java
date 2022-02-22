/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalv3.data;

import java.util.ArrayList;

/**
 *
 * @author Huynh Trung Tin - SE150037
 */
public class ZooList extends ArrayList<Animals> {

    public void showAll() {
        for (Animals cd : this) {
            System.out.println("Zoo: " + cd.toString());
        }
    }

    public void showTwoLegged() {
        for (Animals an : this) {
            if (an instanceof TwoLegged) {
                System.out.println("Two Legged: " + an.toString());
            }
        }
    }

    public void showFourLegged() {
        for (Animals an : this) {
            if (an instanceof FourLegged) {
                System.out.println("Four Legged: " + an.toString());
            }
        }
    }
    
    
}
