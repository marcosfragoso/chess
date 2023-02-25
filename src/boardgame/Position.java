package boardgame;

public class Position { // Classe referente à posição no tabuleiro

    private int row; // Linha
    private int column; // Coluna

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setValues(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    // Imprimir a posição na tela
    @Override
    public String toString() {
        return row + ", " + column;
    }
}
