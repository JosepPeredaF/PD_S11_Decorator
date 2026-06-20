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
        return cafe.costo() + 0.10;
    }
}
