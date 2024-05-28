public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.setMake("Audi");
        c.setModel("Gt3r");
        c.setColor("Grey");
        c.setDoors(2);
        c.setConvertible(true);
        System.out.println("make = "+ c.getMake());
        System.out.println("model = " + c.getModel());
        System.out.println("color = "+ c.getColor());
        c.describeCae();
        Car n = new Car();
        n.setColor("Green");
        n.setMake("Jeep");
        n.setModel("Rubicon");
        n.describeCae();
        System.out.println("yASEEN");
    }
}