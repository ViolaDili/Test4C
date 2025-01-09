public class Main {
    public static void main(String[] args) {
        Portamonete pm = new Portamonete();
        pm.Inserisci(0.5);
        pm.Inserisci(1.0, 3);
        pm.Inserisci(2.0, 2);
        
        pm.DenaroPerTipo();
        System.out.println("Totale denaro: " + pm.Denaro() + " euro");

        // Crea un portafoglio con monete e banconote
        Portafogli pf = new Portafogli();
        pf.Inserisci(0.5);
        pf.Inserisci(1.0, 2);
        pf.InserisciBanconota(5.0, 2);
        pf.InserisciBanconota(10.0);
        
        pf.DenaroPerTipo();  // Monete
        pf.Banconote();      // Banconote
        pf.denaroTotale();   // Totale
    }
}
    }
}
