package types;

public enum CreatureType {
    DRAGON(20),
    OGRE(10),
    GOBLIN(5);


    private final int protection;

    CreatureType(int protection) {
        this.protection = protection;
    }

    public int getProtection() {
        return protection;
    }
}
