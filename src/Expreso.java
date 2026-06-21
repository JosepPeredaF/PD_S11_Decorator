public class Expreso implements Cafe{

    private Tamano tamano;

    public Expreso(Tamano tamano) {
        this.tamano = tamano;
    }

    @Override
    public String descripcion() {
        return "Cafe expreso con " +tamano + " con";
    }

    @Override
    public double costo() {

        switch (tamano) {
            case N: return 1.99;
            case M: return 2.09;
            case G: return 2.15;
        }
        return 0;
    }

    @Override
    public Tamano getTamano() {
        return tamano;
    }
}
