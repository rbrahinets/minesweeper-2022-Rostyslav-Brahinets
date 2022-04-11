package minesweeper;

public record Coordinate(int x, int y) {
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Coordinate that = (Coordinate) o;
        return x == that.x && y == that.y;
    }
}
