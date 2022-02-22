/*
    Document   : admin
    Created on : july 11, 2021, 5:00:00 PM
    Author     : hd
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalv3.data;

/**
 *
 * @author hd
 */
public class AnimalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Animal V3.");
        // your code here
        I_Menu menu = new Menu();
        menu.addItem("\n========= Zoo Management ==========");
        menu.addItem("1. Add new animal.");
        menu.addItem("2. Update animal.");
        menu.addItem("3. Delete animal.");
        menu.addItem("4. Search animal by Name.");
        menu.addItem("5. Show animal list by Type.");
        menu.addItem("6. Show all");
        menu.addItem("Others- Quit");
        int choice;
        ZooList list = new ZooList();
        do {
            Animals an = null;
            int index;
            String id = "";
            boolean check = false;
            menu.showMenu();
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    System.out.println("--------- Add new animal ----------");
                    System.out.println("1. Two Legged.");
                    System.out.println("2. Four Legged.");
                    int subChoice = Utils.getIntLimit("Enter your choice: ", 1, 2);
                    switch (subChoice) {
                        case 1:
                            an = new TwoLegged();
                            an.createAnimal();
                            index = list.indexOf(an);
                            if (index == -1) {
                                list.add(an);
                                System.out.println("Animal Added!");
                            } else {
                                System.out.println("Duplicate ID!");
                            }
                            break;
                        case 2:
                            an = new FourLegged();
                            an.createAnimal();
                            index = list.indexOf(an);
                            if (index == -1) {
                                list.add(an);
                                System.out.println("Animal Added!");
                            } else {
                                System.out.println("Duplicate ID!");
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("--------- Update animal -------");
                    id = Utils.getString("Input the ID that you want to update:");
                    index = list.indexOf(new TwoLegged(id));
                    if (index != -1) {
                        an = list.get(index);
                        an.updateAnimal();
                        list.set(index, an);
                        System.out.println("Updated!");
                    } else {
                        System.out.println("Animal does not exist!");
                    }
                    break;
                case 3:
                    System.out.println("--------- Delete animal -------");
                    id = Utils.getString("Input the ID that you want to remove:");
                    check = list.remove(new TwoLegged(id));
                    if (check) {
                        System.out.println("Removed!");
                    } else {
                        System.out.println("Animal does not exist!");
                    }
                    break;
                case 4:
                    System.out.println("---------- Search animal by Name --------");
                    String name = Utils.getString("Input the Name that you want to find:");
                    index = list.indexOf(new FourLegged(name));
                    if (index != -1) {
                        System.out.println("Found: " + list.get(index).toString());
                    } else {
                        System.out.println("Animal does not exist!");
                    }
                    break;
                case 5:
                    System.out.println("---------- Show animal list by Type --------");
                    System.out.println("1. Two Legged.");
                    System.out.println("2. Four Legged.");
                    int showChoice = Utils.getIntLimit("Enter your choice", 1, 2);
                    switch (showChoice) {
                        case 1:
                            list.showTwoLegged();
                            break;
                        case 2:
                            list.showFourLegged();
                            break;
                    }
                    break;
                case 6:
                    System.out.println("---------- Show all --------");
                    list.showAll();
                    break;
            }
        } while (choice > 0 && choice < 7);
    }

}
