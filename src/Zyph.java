/* ###################################
Title: Zyph Class
Author: Draedn Groves
Date: April.10th/2024
Purpose: Creation of a Zyph class (A small magical creature I've created)
################################### */


import java.util.ArrayList;

/**
 * This class represents a Zyph, a small magical creature.
 * Each Zyph has an id, size, weight, type of magic, name, and habitat.
 * The class also maintains a list of all Zyphs created.
 */

public class Zyph {
    private static int autoNumber = 0;
    public static ArrayList<Zyph> zyphs = new ArrayList<>();

    private int id;
    private String size;
    private float weight;
    private String type; // Type of magic/element
    private String name;
    private String habitat;

    /**
     * Default Constructor.
     * Creates a new Zyph and adds it to the list of Zyphs.
     */
    public Zyph() {
        this.id = ++autoNumber;

    }

    /**
     * Parameterized Constructor.
     * Creates a new Zyph with the given parameters and adds it to the list of Zyphs.
     */
    public Zyph(String size, float weight, String type, String name, String habitat) {
        this();
        setSize(size);
        setWeight(weight);
        setType(type);
        setName(name);
        setHabitat(habitat);
    }

    // Getters and Setters
    /**
     * Returns the size of the Zyph.
     * @return String
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the size of the Zyph.
     * The size is converted to lowercase.
     */
    public void setSize(String size) {
        if (Tools.validateStringWithConditions(size)) {
            this.size = size.toLowerCase();
        }
    }

    /**
     * Returns the weight of the Zyph.
     * @return float
     */
    public float getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the Zyph.
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * Returns the type of magic of the Zyph.
     * @return String
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of magic of the Zyph.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns the name of the Zyph.
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the Zyph.
     * The name is validated and trimmed before being set.
     * @return String
     */
    public void setName(String name) {
        String validatedName = Tools.validateAndTrimString(name);
        if (validatedName != null) {
            this.name = validatedName;
        }
    }

    /**
     * the habitat of the Zyph.
     * @return String
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * Sets the habitat of the Zyph.
     * @return String
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }


    // Instance method
    /**
     * Returns a string with the details of the Zyph.
     */
    public String getDetails() {
        return "Name: " + name + ", Type: " + type + ", Size: " + size + ", Weight: " + weight + ", Habitat: " + habitat;
    }

    // Static method
    /**
     *  Get a Zyph.
     * @return String
     */
    public static Zyph getZyph(String name) {
        Zyph myZyph = new Zyph();
        for (Zyph zyph : Zyph.zyphs) {
            if (zyph.getName().equalsIgnoreCase(name)) {
                myZyph = zyph;
            }
        }
        if (myZyph != null) {
            return myZyph;
        }
        return null;
    }
}
