public class Portafogli extends Portamonete{
    private int DieciEuro;
    private int CinqueEuro;
    private int VentiEuro;

    public Portafogli(){
        this.CinqueEuro = 0;
        this.DieciEuro = 0;
        this.VentiEuro = 0;
    }
    public Portafogli(int CinqueEuro, int DieciEuro, int VentiEuro){
        this.CinqueEuro = CinqueEuro;
        this.DieciEuro = DieciEuro;
        this.VentiEuro = VentiEuro;
    }

    public void InserisciBanconota(double valore){
        if(valore == 5.00){
            CinqueEuro++;
        } else if(valore == 10.00){
            DieciEuro++;
        } else if(valore == 20.00){
            VentiEuro++;
        } else{
            System.out.println("Banconota non valida.");
        }
    }
    public void InserisciBanconota(double valore, int n){
        if(valore == 5.00){
            CinqueEuro += n;
        } else if(valore == 10.00){
            DieciEuro += n;
        } else if(valore == 20.00){
            VentiEuro += n;
        } else{
            System.out.println("Banconota non valida.");
        }
    }
    public double Denaro(){
        return CinqueEuro * 5.00 + DieciEuro * 10.00 + VentiEuro * 20.00;
    }
    public String DenaroPerTipo(){
        return ("Banconote totali da 5 euro: " + CinqueEuro + "\nBanconote totali da 10 euro: " + DieciEuro + "\nBanconote totali da 20 euro: " + VentiEuro);
    }
    public void denaroTotale() {
        System.out.println("Denaro totale: " + Denaro() + " euro");
    }
}
