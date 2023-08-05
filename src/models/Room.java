package models;

public class Room {

    // constants

    /** . */
    private static final String NEW_LINE = "\n";

    // instance fields

    /** . */
    private RoomItems myEntrance;

    /** . */
    private RoomItems myExit;

    /** . */
    private DoorDirections myDoorNorth;

    /** . */
    private DoorDirections myDoorEast;

    /** . */
    private DoorDirections myDoorSouth;

    /** . */
    private DoorDirections myDoorWest;

    /** . */
    private RoomItems myOOPillar;

    /** . */
    private RoomItems myHealingPotion;

    /** . */
    private RoomItems myVisionPotion;

    /** . */
    private RoomItems myPit;

    // constructor

    /** . */
    Room(final RoomItems theEntrance, final RoomItems theExit,
         final DoorDirections theDoorNorth, final DoorDirections theDoorEast,
         final DoorDirections theDoorSouth, final DoorDirections theDoorWest,
         final RoomItems theOOPillar, final RoomItems theHealingPotion,
         final RoomItems theVisionPotion, final RoomItems thePit) {

        setEntrance(theEntrance);
        setExit(theExit);
        setDoorNorth(theDoorNorth);
        setDoorEast(theDoorEast);
        setDoorSouth(theDoorSouth);
        setDoorWest(theDoorWest);
        setOOPillar(theOOPillar);
        setHealingPotion(theHealingPotion);
        setVisionPotion(theVisionPotion);
        setPit(thePit);
    }

    // methods

    /** . */
    public final void setEntrance(final RoomItems theEntrance) {
        myEntrance = theEntrance;
    }

    /** . */
    public final RoomItems getEntrance() {
        return myEntrance;
    }

    /** . */
    public final void setExit(final RoomItems theExit) {
        myExit = theExit;
    }

    /** . */
    public final RoomItems getExit() {
        return myExit;
    }

    /** . */
    public final void setDoorNorth(final DoorDirections theNorthDoor) {
        myDoorNorth = theNorthDoor;
    }

    /** . */
    public final DoorDirections getDoorNorth() {
        return myDoorNorth;
    }

    /** . */
    public final void setDoorSouth(final DoorDirections theSouthDoor) {
        myDoorSouth = theSouthDoor;
    }

    /** . */
    public final DoorDirections getDoorSouth() {
        return myDoorSouth;
    }

    /** . */
    public final void setDoorEast(final DoorDirections theEastDoor) {
        myDoorEast = theEastDoor;
    }

    /** . */
    public final DoorDirections getDoorEast() {
        return myDoorEast;
    }

    /** . */
    public final void setDoorWest(final DoorDirections theWestDoor) {
        myDoorWest = theWestDoor;
    }

    /** . */
    public final DoorDirections getDoorWest() {
        return myDoorWest;
    }

    //TODO: May change DT to "char" not "bool"
    /** . */
    public final void setOOPillar(final RoomItems theOOPillar) {
        myOOPillar = theOOPillar;
    }

    /** . */
    public final RoomItems getOOPillar() {
        return myOOPillar;
    }

    /** . */
    public final void setHealingPotion(final RoomItems theHealingPotion) {
        myHealingPotion = theHealingPotion;
    }

    /** . */
    public final RoomItems getHealingPotion() {
        return myHealingPotion;
    }

    /** . */
    public final void setVisionPotion(final RoomItems theVisionPotion) {
        myVisionPotion = theVisionPotion;
    }

    /** . */
    public final RoomItems getVisionPotion() {
        return myVisionPotion;
    }

    /** . */
    public final void setPit(final RoomItems thePit) {
        myPit = thePit;
    }

    /** . */
    public final RoomItems getPit() {
        return myPit;
    }

    /** . */
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("This room stats:" + NEW_LINE);
        sb.append("***********************************" + NEW_LINE);
        sb.append("Has an Entrance: " + getEntrance() + NEW_LINE);
        sb.append("Has an Exit: " + getExit() + NEW_LINE);
        sb.append("Has an North Door: " + getDoorNorth() + NEW_LINE);
        sb.append("Has an South Door: " + getDoorSouth() + NEW_LINE);
        sb.append("Has an East Door: " + getDoorEast() + NEW_LINE);
        sb.append("Has an West Door: " + getDoorWest() + NEW_LINE);
        sb.append("Has an OO Pillar in models.Room: " + getOOPillar() + NEW_LINE);
        sb.append("Has a Healing Potion in models.Room: " + getHealingPotion() + NEW_LINE);
        sb.append("Has a Vision Potion in models.Room: " + getVisionPotion() + NEW_LINE);
        sb.append("Has a Pit in models.Room: " + getPit() + NEW_LINE);
        return sb.toString();
    }


}