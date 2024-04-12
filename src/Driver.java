/* ###################################
Title: Driver Class
Author: Draedn Groves
Date: April.10th/2024
Purpose: Instantiating the Array List & Adding 5 instances of Class Objects
################################### */


/**
 * Makes a bunch of new magical creatures called Zyphs.
 */
public class Driver {
    public static void makeZyphs() {
        Zyph.zyphs.add(new Zyph("Small", 0.5f, "Fire", "Ember", "Volcano"));
        Zyph.zyphs.add(new Zyph("Medium", 1.0f, "Water", "Aquatious", "Ocean"));
        Zyph.zyphs.add(new Zyph("Large", 2.0f, "Earth", "TerraTor", "Forest"));
        Zyph.zyphs.add(new Zyph("Small", 0.7f, "Air", "Zephyr", "Sky"));
        Zyph.zyphs.add(new Zyph("Medium", 1.2f, "Light", "Lumenesse", "Sun"));

    }
}