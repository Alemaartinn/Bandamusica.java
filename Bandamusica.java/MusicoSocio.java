public class MusicoSocio {
    package dominio;

public class MusicoSocio extends Musico {
    private int numeroSocio;

    public MusicoSocio(String nombre, String instrumento, int numeroSocio) {
        super(nombre, instrumento);
        this.numeroSocio = numeroSocio;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    @Override
    public String toString() {
        return super.toString() + ", número de socio: " + numeroSocio;
    }
}

}
