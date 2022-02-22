/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalv3.data;

/**
 *
 * @author Huynh Trung Tin - SE150037
 */
public interface I_Menu {
    //add text to menu
    void addItem(String s);
    
    //get user choice
    int getChoice();
    
    //show Menu
    void showMenu();
}
