package package16oop.encapsulation;

public class Pizza {

    private String size;
    private int cheeseToppings, pepperoniToppings;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")) {
            this.size = size;
        }else {
            System.err.println("Invalid size" + size);
            System.exit(1);
        }
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(int cheeseToppings) {
        if (cheeseToppings < 0) {
            System.err.println("Invalid cheeseToppings" + cheeseToppings);
            System.exit(1);
        }
        this.cheeseToppings = cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        if (pepperoniToppings < 0) {
            System.err.println("Invalid pepperoniToppings" + pepperoniToppings);
            System.exit(1);
        }
        this.pepperoniToppings = pepperoniToppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheeseToppings=" + cheeseToppings +
                ", pepperoniToppings=" + pepperoniToppings +
                '}';
    }

    public Pizza(String size, int pepperoniToppings, int cheeseToppings) {
        setSize(size);
        setCheeseToppings(cheeseToppings);
        setPepperoniToppings(pepperoniToppings);
    }

    public double calcCost() {
        double startingPrice = (size.equalsIgnoreCase("small")) ? 10
                : (size.equalsIgnoreCase("medium")) ? 12 : 14;

        double toppings = (cheeseToppings + pepperoniToppings) * 2;

        return startingPrice + toppings;
    }

}
