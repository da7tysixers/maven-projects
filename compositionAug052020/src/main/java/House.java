public class House {
    private SingleRoom room;
    private Window windows;


    public House(SingleRoom room, Window windows) {
        this.room = room;
        this.windows = windows;
    }

    public SingleRoom getRoom() {
        return room;
    }

    public void setRoom(SingleRoom room) {
        this.room = room;
    }

    public Window getWindows() {
        return windows;
    }

    public void setWindows(Window windows) {
        this.windows = windows;
    }
}
