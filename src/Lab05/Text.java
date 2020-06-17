package Lab05;

import java.util.Arrays;

public class Text {
    private Sentence[] text;

    public Text(Sentence[] text) {
        this.text = text;
    }

    public Sentence[] getText() {
        return text;
    }

    public void setText(Sentence[] text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Text{" +
                "text=" + Arrays.toString(text) +
                '}';
    }
}
