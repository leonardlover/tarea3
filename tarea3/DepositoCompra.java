package tarea3;

class DepositoCompra {
    private Bebida bebida;

    public DepositoCompra() {
    }

    public void addBebida(Bebida b) {
        bebida = b;
    }

    public Bebida getBebida() {
        Bebida b = bebida;
        bebida = null;

        return b;
    }

    public Boolean isEmpty() {
        return (bebida == null) ? true : false;
    }
}
