package house.before1;

import house.model.Garden;

public class HouseWithGarden extends House {

    private Garden garden;

    public HouseWithGarden(int windows, int doors, int rooms, Garden garden) {
        super(windows, doors, rooms);
        this.garden = garden;
    }

}
