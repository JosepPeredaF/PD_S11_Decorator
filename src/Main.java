public class Main {
    static void main() {

        Cafe c1 = new Expreso();
        c1 = new Leche(c1);
        c1 = new Soya(c1);
        c1 = new Moca(c1);
        c1 = new Crema(c1);

        System.out.println("Pedido A "+ "\n" + c1.descripcion() +
                "\nTotal: "+ c1.costo());

        System.out.println("-----------------------");

        Cafe c2 = new Descafeinado();
        c2 = new Leche (new Soya(new Moca(new Moca(new Descafeinado()))));
        System.out.println("Pedido B "+ "\n" + c2.descripcion() +
                "\nTotal: "+ c2.costo());


        Cafe c3 = new Batido();
        Cafe c4 = new TostadoNegro();



    }
}
