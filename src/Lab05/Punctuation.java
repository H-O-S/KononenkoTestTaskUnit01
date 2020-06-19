package Lab05;

public class Punctuation implements ProposalMembers {
    private Character punctuation;

    public Punctuation(Character punctuation) {
        this.punctuation = punctuation;
    }

    public Character getPunctuation() {
        return punctuation;
    }

    public void setPunctuation(Character punctuation) {
        this.punctuation = punctuation;
    }

    @Override
    public String toString() {
        return "Punctuation{" +
                "punctuation='" + punctuation + '\'' +
                '}';
    }
}
