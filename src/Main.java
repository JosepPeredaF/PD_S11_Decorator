public class Main {
    static void main() {

        Cafe c1 = new Expreso(Tamano.G);
        c1 = new Leche(c1);
        c1 = new Soya(c1);
        c1 = new Moca(c1);
        c1 = new Crema(c1);

        System.out.println("Pedido A "+ "\n" + c1.descripcion() +
                "\nTotal: "+ c1.costo());

        System.out.println("-----------------------");


        Cafe c2 = new Leche(new Soya(new Moca(new Moca(new Descafeinado(Tamano.M)))));
        System.out.println("Pedido B "+ "\n" + c2.descripcion() +
                "\nTotal: "+ c2.costo());

        System.out.println("-----------------------");


        Cafe c3 = new Moca(new Moca(new Soya(new Soya(new Leche(new Leche(new Crema(new Crema(new Batido(Tamano.N)))))))));
        System.out.println("Pedido C "+ "\n" + c3.descripcion() +
                "\nTotal: "+ c3.costo());

        System.out.println("-----------------------");

        Cafe c4 = new Soya(new Soya(new Soya(new Crema(new Crema(new TostadoNegro(Tamano.G))))));
        System.out.println("Pedido D "+ "\n" + c4.descripcion() +
                "\nTotal: "+ c4.costo());


    }
}
