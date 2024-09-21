
public class Main {
    public static void main(String[] args) {

        ZapatoFabrica factory = new ZapatoFabrica();

        Zapato zapatoDeportivo = factory.crearZapato("deportiva", "niño");
        zapatoDeportivo.Detalles();

        Zapato zapatoFormal = factory.crearZapato("formal", "mujer");
        zapatoFormal.Detalles();

        Zapato zapatoDeportivo2 = factory.crearZapato("deportiva", "hombre");
        zapatoDeportivo.Detalles();

        Zapato zapatoFormal2 = factory.crearZapato("formal", "niño");
        zapatoFormal.Detalles();


    }


}