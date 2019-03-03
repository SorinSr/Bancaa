public class PersoanaJuridica extends Client{
    int cui;
    public PersoanaJuridica(){
        super.nume=nume;
        super.cod=cod;
        super.telefon=telefon;
        super.suma=suma;
        this.cui=cui;
        System.out.println("S-a adaugat o Persoana Juridica.");
    }
    public String toString(){
        return "Firma cu numele "+super.nume+" are in cont suma de "+super.suma+ " lei si are CUI-ul: " +this.cui+".";
    }
}
