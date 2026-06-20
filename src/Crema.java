public class Crema extends Decorator{

    public Crema(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String descripcion() {
        return cafe.descripcion() + ", crema";
    }

    @Override
    public double costo() {
        return cafe.costo() + 0.10;
    }
}
