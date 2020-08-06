public class SingleRoom {
    private Furniture roomFurniture;
    private Ceiling ceiling;
    private Window window;
    private Walls wall;

    public SingleRoom(Furniture roomFurniture, Ceiling ceiling, Walls wall, Window window) {
        this.roomFurniture = roomFurniture;
        this.ceiling = ceiling;
        this.wall = wall;
        this.window = window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }
    public Window getWindow() {
        return window;
    }


    public Furniture getRoomFurniture() {
        return roomFurniture;
    }

    public void setRoomFurniture(Furniture roomFurniture) {
        this.roomFurniture = roomFurniture;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }

    public Walls getWall() {
        return wall;
    }

    public void setWall(Walls wall) {
        this.wall = wall;
    }



    public String toString() {
        return ceiling.getCeil() + wall.getWallFOur() + roomFurniture.getBed() + roomFurniture.getCouch()
                + window.getWindow();
    }
}
