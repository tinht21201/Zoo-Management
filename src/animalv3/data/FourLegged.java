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
public class FourLegged extends Animals{
    private String specialty;

    public FourLegged() {
    }

    public FourLegged(String name) {
        this.name = name;
    }

    public FourLegged(String specialty, String id, String name, String skinColor, String movement, int weigth) {
        super(id, name, skinColor, movement, weigth);
        this.specialty = specialty;
    }
    

    public FourLegged(String specialty, String id) {
        this.specialty = specialty;
        this.id = id;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    
    public String huntAnmimals() {
        return "Animals hunt big animals and eat meat without cooking";
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "Specialty: " + this.specialty + ", " + "Hunt: " + huntAnmimals(); 
    }

    @Override
    public void updateAnimal() {
        super.updateAnimal();
        this.specialty = Utils.updateString(this.specialty,"Update Specialty: ");
    }

    @Override
    public void createAnimal() {
        super.createAnimal();
        this.specialty = Utils.getString("Specialty: ");
    }
    @Override
     public boolean equals(Object obj) {
        return this.name.equals(((Animals) obj).getName());
    }
    
}
