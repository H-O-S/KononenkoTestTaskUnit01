package Lab05;

import java.util.Arrays;

public class Word implements ProposalMembers{
    private Letter[] word;

    public Word(Letter[] word) {
        this.word = word;
    }

    public Letter[] getWord() {
        return word;
    }

    public void setWord(Letter[] word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word=" + Arrays.toString(word) +
                '}';
    }
}
