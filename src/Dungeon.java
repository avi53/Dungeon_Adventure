import java.util.Random;

public class Dungeon {
    private static final int MAZE_SIZE = (int) Math.random();


    private Room[][] myMazeRoom;
    private String myAdventureLocation;

    public Dungeon() {
//        myMazeRoom = new Room[][];
        myAdventureLocation = "0.0";
        randomlyGenerateRooms();
        checkIfEntranceToExitIsValid();
        placeRandomContentInRoom();
        placeRandomMonsterInRoom();
    }

    public void randomlyGenerateRooms() {

    }

    public boolean checkIfEntranceToExitIsValid() {

        //room class needs to be class
        return false;

    }

    public void placeRandomContentInRoom() {

        Random room = new Random();

        for (int i = 0; i < MAZE_SIZE; i++ ) {
            for (int j = 0; j < MAZE_SIZE; j++) {
                myMazeRoom[i][j].setOOPillar(room.nextBoolean());
                myMazeRoom[i][j].setPit(room.nextBoolean());
                myMazeRoom[i][j].setVisionPotion(room.nextBoolean());
            }
        }

    }

    //THIS NEEDS TO BE COMPLETEDDDDDDD!!!!!!!!
    public DungeonCharacter placeRandomMonsterInRoom() {
        Random random = new Random();

        DungeonCharacter monster = null;

        return monster;
    }

//    public DungeonCharacter placeRandomMonsterInRoom() {
//        Random newRandom = new Random();
//        int random;
//    }

    public void setMazeRoom(Room[][] mazeRoom) {
        myMazeRoom = mazeRoom;
    }

    public Room[][] getMyMazeRoom() {
        return myMazeRoom;
    }

    public void setMyAdventureLocation(String myAdventureLocation) {
        this.myAdventureLocation = myAdventureLocation;
    }

    public String getMyAdventureLocation() {
        return myAdventureLocation;
    }

    public String toString() {
        return "";
    }
}