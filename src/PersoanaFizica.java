public class PersoanaFizica extends Client{
    public PersoanaFizica(){
        super.nume=nume;
        super.cod=cod;
        super.telefon=telefon;
        super.suma=suma;
        System.out.println("S-a adaugat o Persoana Fizica.");
    }
    public String toString(){
        return "Clienul cu numele "+super.nume+" are in cont suma de "+super.suma+ " lei.";
    }
}
