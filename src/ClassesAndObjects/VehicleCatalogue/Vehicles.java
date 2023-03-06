package ClassesAndObjects.VehicleCatalogue;

public class Vehicles {
    String type;
    String model;
    String color;
    int hp;

    public Vehicles(String type, String model, String color, int hp) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.hp = hp;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

//    Type: Car
//    Model: Ferrari
//    Color: red
//    Horsepower: 550

    @Override
    public String toString() {
        return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %d\n", getType(), getModel(), getColor(), getHp());
    }
}
