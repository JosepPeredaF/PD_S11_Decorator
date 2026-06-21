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
        switch (cafe.getTamano()) {
            case N: return cafe.costo() + 0.10;
            case M: return cafe.costo() + 0.15;
            case G: return cafe.costo() + 0.20;
        }
        return cafe.costo();
    }
}
