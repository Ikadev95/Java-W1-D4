package esercizi.esercizio1;

public class DipartimentoMain {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente(4673284, 1200, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente(675486,1400,Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente3 = new Dipendente(574839, 1500,Dipartimento.VENDITE);

        Dipendente [] arrayDipendenti = {dipendente1, dipendente2, dipendente3};

        for (int i = 0; i < arrayDipendenti.length; i++) {
            System.out.println("Matricola: " +arrayDipendenti[i].getMatricola());
        }


    }
}
