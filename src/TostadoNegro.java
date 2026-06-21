public class TostadoNegro implements Cafe{
    private Tamano tamano;

    public TostadoNegro(Tamano tamano) {
        this.tamano = tamano;
    }

    @Override
    public String descripcion() {
        return "Cafe tostado negro " + tamano + " con";
    }

    @Override
    public double costo() {
        switch (tamano) {
            case N: return 0.99;
            case M: return 1.09;
            case G: return 1.19;
        }
        return 0;
    }

    @Override
    public Tamano getTamano() {
        return tamano;
    }

}
