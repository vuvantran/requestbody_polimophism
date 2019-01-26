package domain;

import java.util.List;

public class Parrot extends Bird {

    private Integer kind;

    private List<String> words;

    public Integer getKind() {
        return kind;
    }

    public void setKind(Integer kind) {
        this.kind = kind;
    }

    public void speak(String content) {
        System.out.println(content);
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }
}
