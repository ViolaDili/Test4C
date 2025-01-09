public class Portamonete{
    private double CiquantaCent;
    private double UnEuro;
    private double DueEuro;

    public Portamonete(){
        this.CiquantaCent = 0;
        this.UnEuro = 0;
        this.DueEuro = 0;
    }
    public Portamonete(double CiquantaCent, double UnEuro, double DueEuro){
        this.CiquantaCent = CiquantaCent;
        this.UnEuro = UnEuro;
        this.DueEuro = DueEuro;
    }

    public void Inserisci(double valore){
        if(valore == 0.50){
            CiquantaCent++;
        } else if(valore == 1.00){
            UnEuro++;
        } else if(valore == 2.00){
            DueEuro++;
        } else{
            System.out.println("Moneta non valida.");
        }
    }

    public void Inserisci(double valore, int n){
        if(valore == 0.50){
            CiquantaCent += n;
        } else if(valore == 1.00){
            UnEuro += n;
        } else if(valore == 2.00){
            DueEuro += n;
        } else{
            System.out.println("Moneta non valida.");
        }
    }

    public double Denaro(){
        return CiquantaCent * 0.50 + UnEuro * 1.00 + DueEuro * 2.00;
    }

    public String DenaroPerTipo(){
        return ("Monete totali da 50 cent: " + CiquantaCent + "\nMonete totali da un euro: " + UnEuro + "\nMonete totali da due euro: " + DueEuro);
    }
}