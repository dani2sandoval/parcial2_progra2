public class ZapatoFabrica {
    public Zapato crearZapato(String linea, String Cliente) {
        if (linea.equalsIgnoreCase("deportiva")) {
            return new ZapatoDeportivo(Cliente);
        } else if (linea.equalsIgnoreCase("formal")) {
            return new ZapatoFormal(Cliente);
        }
        throw new IllegalArgumentException("esa linea no existe");
    }


}
