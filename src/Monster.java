import java.util.ArrayList;
import java.util.List;

public class Monster implements Isavable{
    private String name;
    private int hitPoint;
    private int strength;

    public Monster(String name, int hitPoint, int strength) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public int getStrength() {
        return strength;
    }



    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoint);
        values.add(2,"" + this.strength);
        return values;
    }

    @Override
    public void read(List<String> savedValue) {
        if(savedValue != null && savedValue.size() > 0){
            if(savedValue.get(0) != null) {
                this.name = savedValue.get(0);
            }else {
                this.name = "Un-Known name";
            }
            if(savedValue.get(1) != null) {
                this.hitPoint = Integer.parseInt(savedValue.get(1));
            }else{
                this.hitPoint = 0;
            }
            if(savedValue.get(2) != null) {
                this.strength = Integer.parseInt(savedValue.get(2));
            }else{
                this.strength = 0;
            }
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoint=" + hitPoint +
                ", strength=" + strength +
                '}';
    }
}
