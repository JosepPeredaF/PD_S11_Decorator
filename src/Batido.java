public class Batido implements Cafe{

    private Tamano tamano;

    public Batido(Tamano tamano) {
        this.tamano = tamano;
    }

    @Override
    public String descripcion() {
        return "Cafe batido " + tamano + " con";
    }

    @Override
    public double costo() {
        switch (tamano) {
            case N: return 0.89;
            case M: return 0.99;
            case G: return 1.09;
        }
        return 0;
    }

    @Override
    public Tamano getTamano() {
        return tamano;
    }
}
