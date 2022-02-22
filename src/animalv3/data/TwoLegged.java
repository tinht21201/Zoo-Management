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
public class TwoLegged extends Animals {

    private final int SWINGS = 2;

    public TwoLegged() {

    }

    public TwoLegged(String id) {
        this.id = id;
    }

    public String specialtySound() {
        return "animals will eat fresh fruit and make a \"coocku\" sound";
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "Swing: " + this.SWINGS + ", " + "Sound: " + specialtySound();
    }

    @Override
    public void updateAnimal() {
        super.updateAnimal();
    }

    @Override
    public void createAnimal() {
        super.createAnimal();
    }

    @Override
    public boolean equals(Object obj) {
        return this.id.equals(((Animals) obj).getId());
    }

}
