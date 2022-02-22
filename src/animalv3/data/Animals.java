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
public abstract class Animals {
    protected String id;
    protected String name;
    protected String skinColor;
    protected String movement;
    protected int weigth;

    public Animals() {
    }

    public Animals(String id, String name, String skinColor, String movement, int weigth) {
        this.id = id;
        this.name = name;
        this.skinColor = skinColor;
        this.movement = movement;
        this.weigth = weigth;
    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public void createAnimal() {
        System.out.println("Create new animal:");
        this.id = Utils.getString("ID: ");
        this.name = Utils.getString("Name: ");
        this.skinColor = Utils.getString("Skin Color: ");
        this.movement = Utils.getString("Movement: ");
        this.weigth = Utils.getPositiveInt("Weight: ");
    }

    public void updateAnimal() {
        System.out.println("Update animal:");
        //this.id = Utils.updateString(this.id, "Update ID:");
        this.name = Utils.updateString(this.name, "Update Name:");
        this.skinColor = Utils.updateString(this.skinColor, "Update Skin Color:");
        this.movement = Utils.updateString(this.movement, "Update Movement:");
        this.weigth = Utils.getPositiveInt("Update Weigth:");
    }

    @Override
    public String toString() {
        return "Animal: " + "ID: " + this.id + ", " + "Name: " + this.name
                + ", " + "Skin Color: " + this.skinColor + ", " + "Movement: "
                + this.movement + ", " + "Weight: " + this.weigth;
    }

    @Override
    public boolean equals(Object obj) {
        return this.id.equals(((Animals) obj).getId());
    }

}
