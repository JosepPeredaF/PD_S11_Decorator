public class Expreso implements Cafe{
    @Override
    public String descripcion() {
        return "Cafe expreso con";
    }

    @Override
    public double costo() {
        return 1.99;
    }
}
