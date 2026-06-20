public class Moca extends Decorator{
    public Moca(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String descripcion() {
        return cafe.descripcion() + ", Moca";
    }

    @Override
    public double costo() {
        return cafe.costo() + 0.20;
    }
}
