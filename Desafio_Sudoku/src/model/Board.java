package model;

import java.util.List;

public class Board {
    private final List<List<Space>> spaces;

    public Board(List<List<Space>> spaces) {
        this.spaces = spaces;
    }

    public List<List<Space>> getSpaces() {
        return spaces;
    }

    public void printBoard() {
        for (int row = 0; row < 9; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("------+-------+------");
            }
            for (int col = 0; col < 9; col++) {
                if (col % 3 == 0 && col != 0) {
                    System.out.print("| ");
                }
                Integer val = spaces.get(row).get(col).getActual();
                System.out.print((val == null ? "." : val) + " ");
            }
            System.out.println();
        }
    }

    // Exemplo básico de mudança de valor
    public boolean changeValue(int row, int col, int value) {
        Space space = spaces.get(row).get(col);
        if (space.isFixed()) {
            return false;
        }
        space.setActual(value);
        return true;
    }

    public boolean clearValue(int row, int col) {
        Space space = spaces.get(row).get(col);
        if (space.isFixed()) {
            return false;
        }
        space.setActual(null);
        return true;
    }

    // Aqui você pode colocar métodos como getStatus(), hasErrors(), gameIsFinished() conforme sua lógica.
    // Para simplificar, vou deixar com implementações vazias:
    public Status getStatus() {
        return new Status("Jogo em andamento");
    }

    public boolean hasErrors() {
        return false;
    }

    public boolean gameIsFinished() {
        return false;
    }

    public void reset() {
        for (List<Space> row : spaces) {
            for (Space space : row) {
                if (!space.isFixed()) {
                    space.setActual(null);
                }
            }
        }
    }

    // Classe interna de exemplo para status
    public static class Status {
        private final String label;

        public Status(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }
}
