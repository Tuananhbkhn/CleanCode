package house.after2;

import house.model.Garage;
import house.model.Garden;
import house.model.SwimmingPool;

/**
 * Solution 2 - Create Builder class into House class
 * Initialize House object into a private constructor of House class with Builder object as a parameter
 */
public class HouseApplication {

    public static void main(String[] args) {
        House simpleHouse = new House.Builder()
                .windows(2)
                .doors(1)
                .rooms(1)
                .build();
        System.out.println(simpleHouse);

        House advancedHouse = new House.Builder()
                .windows(4)
                .doors(2)
                .rooms(3)
                .garage(new Garage())
                .swimmingPool(new SwimmingPool())
                .garden(new Garden())
                .build();
        System.out.println(advancedHouse);
    }

}
