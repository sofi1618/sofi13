package Class;

public enum Color {
    BLACK("Black"),
    ORANGE("Orange"),
    WHITE("White"),
    YELLOW("Yellow"),
    BLUE("Blue"),
    GREEN("Green");


    private final String label;

    Color(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
