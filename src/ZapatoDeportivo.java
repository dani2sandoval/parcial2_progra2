public class ZapatoDeportivo implements Zapato {
    private String Cliente;

    public ZapatoDeportivo(String tipoCliente) {
        this.Cliente = tipoCliente;
    }

    @Override
    public void Detalles() {
        System.out.println("Zapato Deportivo de " + Cliente);
    }
}