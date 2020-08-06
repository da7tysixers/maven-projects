public class Main {

    public static void main(String[] args) {
        Walls walls = new Walls(" WestWall", " NorthWall", " EastWall", " SouthWall ");
        Furniture furniture = new Furniture(" King size bed ", "Love Seat", "Computer Desk");
        Ceiling celing = new Ceiling("8ft Ceiling with ceiling fan ");
        Window window = new Window(60, 40, " French Style Window");
        SingleRoom room = new SingleRoom(furniture, celing, walls, window);
        House house = new House(room, window);

        System.out.println(house.getRoom());
    }
}
