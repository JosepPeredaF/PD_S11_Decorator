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
        switch (cafe.getTamano()) {
            case N: return cafe.costo() + 0.15;
            case M: return cafe.costo() + 0.20;
            case G: return cafe.costo() + 0.25;
        }
        return cafe.costo();
    }
}
