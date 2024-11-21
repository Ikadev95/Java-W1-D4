package esercizi.esercizio3;

public class Volontario implements ITurno {
    private String nome;
    private int eta;
    private String cv;

    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    @Override
    public void checkIn() {
        System.out.println("inizio orario: ore 8:30");
    }
}
