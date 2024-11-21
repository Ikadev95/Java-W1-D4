package esercizi.esercizio2;

public class DipartimentoMain {
    public static void main(String[] args) {
        Dipendente dipendente1 = new DipendenteFullTime(4673284, Dipartimento.PRODUZIONE,1500);
        Dipendente dipendente2 = new DipendentePartTime(675486, Dipartimento.AMMINISTRAZIONE,30,20);
        Dipendente dipendente3 = new Dirigente(574839, Dipartimento.VENDITE,1600,100);

        Dipendente[] arrayDipendenti = {dipendente1, dipendente2, dipendente3};

        for (int i = 0; i < arrayDipendenti.length; i++) {
            System.out.println("Stipendio totale: " +arrayDipendenti[i].calculateSalary());
        }


    }
}
