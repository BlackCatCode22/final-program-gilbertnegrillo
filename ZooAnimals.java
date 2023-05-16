// Animal Class
// Reference: Animal.class file, Cengage Chapter 11: Classes and Objects

// Class name is ZooAnimals
public class ZooAnimals {
    // Member variables: 11 total
    // Private keyword is used to make it only accessible in the class itself
    // Use of String and int data types
    private static int numOfAnimals = 0;
    private String id;
    private String species;
    private String name;
    private int age;
    private String birthDate;
    private String color;
    private String gender;
    private int weight;
    private String origin;
    private String arrivalDate;

// Create constructor to create objects
// The constructor uses the same method name as the class (zooAnimals)
// Holds a parameter that take in variables
    public ZooAnimals(String id, String species, String name, int age, String birthDate, String color, String gender, int weight, String origin, String arrivalDate) {
        // Use this keyword to differentiate from the parameter and zooAnimals class
        this.id = id;
        this.species = species;
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
        this.color = color;
        this.gender = gender;
        this.weight = weight;
        this.origin = origin;
        this.arrivalDate = arrivalDate;
        numOfAnimals++; // Increase the number of animals by 1
    }

// Use override to the toString() method to return an output
// toString() is a method to make an object into a string
@Override
    public String toString() { // Use String data type to return a string value
        return id + " " + species + " " + name + " " + age + " " + birthDate + " " + color + " " + gender + " " + weight + " " + origin + " " + arrivalDate;
    }

// Getters and Setters
// Getters return the value of a specific variable
// Setters change the value of a specific variable
//  Void method doesn't return the value to the main
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getNumOfAnimals() {
        return numOfAnimals;
    }
}