import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Player implements Isavable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() { // this meathod is mainly used to add the fileds of this class in the array list
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        values.add(3,  this.weapon);


        return values;
    }

    @Override
    public void read(List<String> savedValue) {
        //this methode was created as a setter to set the data that was added to the array list
       if (savedValue != null && savedValue.size() > 0){
           this.name = savedValue.get(0);
           this.hitPoints = Integer.parseInt(savedValue.get(1));
           this.strength = Integer.parseInt(savedValue.get(2));
           this.weapon = savedValue.get(3);

       }

    }
}
