public class Square {
    private int side;
    private int field;
    private int circuit;

    public Square(int side, int field, int circuit) {
        this.side = side;
        this.field = field;
        this.circuit = circuit;
    }

    public int getSide() {
        return side;
    }

    public int getField() {
        return field;
    }

    public int getCircuit() {
        return circuit;
    }

    void setSide(int side) {
        this.side = side;
        this.field = side * side;
        this.circuit = 4 * side;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Square)) {
            return false;
        }

        return this.side == ((Square) o).side;
    }
}
