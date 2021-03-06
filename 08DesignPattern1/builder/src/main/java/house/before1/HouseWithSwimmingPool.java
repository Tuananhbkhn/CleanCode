package house.before1;

import house.model.SwimmingPool;

public class HouseWithSwimmingPool extends House {

    private SwimmingPool swimmingPool;

    public HouseWithSwimmingPool(int windows, int doors, int rooms, SwimmingPool swimmingPool) {
        super(windows, doors, rooms);
        this.swimmingPool = swimmingPool;
    }

}
