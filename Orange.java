
public class Orange {
    private int deliciousMeter;
    public String species;

    public Orange() {
        deliciousMeter = 7;
        species = "Juicy";
    }

    public Orange(int n, String spec) {
        deliciousMeter = n;
        species = spec;
    }

    public int getDeliciousMeter() {
        return deliciousMeter;
    }

    public void setDeliciousMeter(int n) {
        deliciousMeter = n;
        return;
    }

    public String toString() {
        return "Orange sort " + species;
    }
}
