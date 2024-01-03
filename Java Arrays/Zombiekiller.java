/**
 * @LuisRamirez
 * Zombie killer with Arrays
 * First: Set your weapons(at least 3) in a list
 * Second: 
 * 
 */


public class Zombiekiller {

    public static void main(String[] args) {
        // Welcome to this programming.

        System.out.println("Welcome to our zombie killer program!");

        System.out.println(" ");

        // In a zombie apocalypsis we have to have something to deffens us, like a weapon...
        // Creating three weapons inside our backpack list 
        String backpack[] = {"Shotgun", "Assault Rifle", "Sniper"};

        // Different kind of zombies
        String zombies[] = {"Close-range zombie", "Mid-range zombie", "Long-range zombie"};

        // Zombie damage points
        int damageZombieHate[] = {23, 45, 65, 88, 22, 44, 66, 778, 81, 99, 1, 3, 5};

        System.out.println("backpack Items:");
        System.out.println("- " + backpack[0]);
        System.out.println("- " + backpack[1]);
        System.out.println("- " + backpack[2]);

        System.out.println(" ");

        System.out.println("Zombies Types:");
        System.out.println("- " + zombies[0]);
        System.out.println("- " + zombies[1]);
        System.out.println("- " + zombies[2]);

        System.out.println(" ");

        System.out.println("Zombie damage:");
        System.out.println("- " + damageZombieHate[0]);
        System.out.println("- " + damageZombieHate[4]);
        System.out.println("- " + damageZombieHate[9]);

    }
}
