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
        switch (cafe.getTamano()) {
            case N: return cafe.costo() + 0.20;
            case M: return cafe.costo() + 0.25;
            case G: return cafe.costo() + 0.30;
        }
        return cafe.costo();
    }
}
