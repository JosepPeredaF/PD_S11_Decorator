public class Soya extends Decorator{

    public Soya(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String descripcion() {
        return cafe.descripcion() + ", soya";
    }

    @Override
    public double costo() {
        return cafe.costo()+ 0.15;
    }
}
