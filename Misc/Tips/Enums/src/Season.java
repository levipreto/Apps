package Misc.Tips.Enums.src;

public enum Season {
    SUMMER(1), WINTER(2), SPRING(3), FALL(4);

    private int value;

    private Season(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}