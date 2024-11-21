package esercizi.esercizio3;

public abstract class Dipendente implements ITurno {
    private int matricola;
    private Dipartimento dipartimento;

    public Dipendente(int matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
    }


    public int getMatricola() {
        return matricola;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public abstract double calculateSalary();
}
