package package16oop.encapsulation;

public class EncapsulationIntro {

    public static void main(String[] args) {

        // An object hides its internal data from code that's outside the class.

        // Hide an instance variable by giving private access modifier,
        // and making the methods that access those fields public.

        // These public methods are called getters & setters (accessor and mutator).

        // The getter is used for reading the private data (instance variable) only.
        // The setter is used for writing(modifying) the private data (instance variable) only.

        // Allows us to add restrictions or conditions to read and write the data.

        // Getter:
        // A public instance method that returns the private instance variable's value.
        // Does not pass any parameter.

        // Setter:
        // A public instance method with the void return type.
        // Passes a parameter, and assigns the given argument to the private instance variable.

    }

}
