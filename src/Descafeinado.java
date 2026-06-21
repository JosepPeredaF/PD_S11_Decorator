public class Descafeinado implements Cafe{
    private Tamano tamano;

    public Descafeinado(Tamano tamano) {
        this.tamano = tamano;
    }

    @Override
    public String descripcion() {
        return "Cafe descafeinado " + tamano + " con";
    }

    @Override
    public double costo() {
        switch (tamano) {
            case N: return 1.05;
            case M: return 1.15;
            case G: return 1.25;
        }
        return 0;
    }

    @Override
    public Tamano getTamano() {
        return tamano;
    }
}
