package Lab05;

public class Letter {
    private Character letter;

    public Letter(Character letter) {
        this.letter = letter;
    }

    public Character getLetter() {
        return letter;
    }

    public void setLetter(Character letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "letter='" + letter + '\'' +
                '}';
    }
}
