public class ZapatoFormal implements Zapato {
    private String Cliente;

    public ZapatoFormal(String Cliente) {
        this.Cliente = Cliente;
    }

    @Override
    public void Detalles() {
        System.out.println("zapato Formal de " + Cliente);
    }
}

