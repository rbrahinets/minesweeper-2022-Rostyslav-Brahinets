package minesweeper;

import java.util.Optional;

public class Flag {
    private Matrix flagMap;

    void start() {
        flagMap = new Matrix(Cell.CLOSED);
    }

    Optional<Cell> get(Coordinate coordinate) {
        return flagMap.get(coordinate);
    }

    public void setOpenedToCell(Coordinate coordinate) {
        flagMap.set(Cell.OPENED, coordinate);
    }
}