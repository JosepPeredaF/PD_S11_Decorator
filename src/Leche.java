public class Leche extends Decorator{


    public Leche(Cafe cafe){
        super(cafe);
    }
    @Override
    public String descripcion() {
        return cafe.descripcion()+ ", leche";
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
