package java_jdbc_primjer;

/**
 * Klasa koja opisuje jedan redak u tablici 'Grad'.
 */
class Grad {

    private int id;
    private int idDrzave;
    private String naziv;

    public Grad(int id, int idDrzave, String naziv) {
        this.id = id;
        this.idDrzave = idDrzave;
        this.naziv = naziv;
    }

    public int getId() {
        return id;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getIdDrzave() {
        return idDrzave;
    }

    @Override
    public String toString() {
        return "Grad: id=" + id + ", idDrzave=" + idDrzave + ", naziv=" + naziv;
    }
}
