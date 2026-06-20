public class Descafeinado implements Cafe{
    @Override
    public String descripcion() {
        return "Cafe descafeinado con";
    }

    @Override
    public double costo() {
        return 1.05;
    }
}
