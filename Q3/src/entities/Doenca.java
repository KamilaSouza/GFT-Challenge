package entities;

import java.util.List;

public class Doenca {

    private String sintoma;

    public Doenca(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }
}
