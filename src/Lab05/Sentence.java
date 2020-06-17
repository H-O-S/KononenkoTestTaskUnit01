package Lab05;

import java.util.Arrays;

public class Sentence {
    private ProposalMembers[] sentence;

    public Sentence(ProposalMembers[] sentence) {
        this.sentence = sentence;
    }

    public ProposalMembers[] getSentence() {
        return sentence;
    }

    public void setSentence(ProposalMembers[] sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "sentence=" + Arrays.toString(sentence) +
                '}';
    }
}
