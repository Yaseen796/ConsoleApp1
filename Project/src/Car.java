public class Car{
private String make = "FORD";
private String model = "MUSTANG";
private String color = "RED";
private int doors = 2;

public boolean convertible = true;

public String getMake(){
    return make;
}

public String getColor() {
    return color;
}

public String getModel() {
    return model;
}

public int getDoors() {
    return doors;
}

public boolean isConvertible() {
    return convertible;
}
public void setMake(String make ){
    if (make == null) make = "Unknown";
    String lowercaseMkae = make.toLowerCase();
    switch (lowercaseMkae){
        case "Ford", "Porsche", "Audi"-> this.make = make;
        default ->
            this.make = "Unsupported ";
    }

}

public void setModel(String model) {
    this.model = model;
}

public void setColor(String color) {
    this.color = color;
}

public void setDoors(int doors) {
    this.doors = doors;
}

public void setConvertible(boolean convertible) {
    this.convertible = convertible;
}

public void describeCae() {
    System.out.println(doors + " " + color + " " + model + " " + make + " " + convertible);
}

}