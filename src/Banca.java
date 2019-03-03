import java.util.*;
public class Banca {

    public static ArrayList <Client> lista = new ArrayList<>();

    private Banca(){}
    private static final class SingletonHolder{
        private static final Banca SINGLETONHOLDER = new Banca();
    }
    public static Banca getInstance(){
        return SingletonHolder.SINGLETONHOLDER;
    }

    public void afisareClienti(){
 //       lista.forEach(System.out::println);
        System.out.println("Lista clientilor este:");
        {
            for(int i=0;i<lista.size();i++){
                if(lista.get(i) instanceof PersoanaFizica && lista.get(i) instanceof PersoanaJuridica){
                    System.out.println("Nume "+lista.get(i).nume+" suma: "+lista.get(i).suma+".");
                }
            }
        }
    }
    public void afisareClient(int x){
        for(int i=0; i<lista.size();i++){
            if(lista.get(i).cod==x){
                System.out.println("Clientul cu codul "+lista.get(i).cod+" are urmatoarele date: Nume - " +lista.get(i).nume+
                        " Telefon - : "+lista.get(i).telefon+ " Buget: "+lista.get(i).suma+".");

            }
        }
    }
    public void afisarePJ(){
        for(int i=0;i<lista.size();i++){
            if(lista.get(i) instanceof PersoanaJuridica){
                System.out.println(lista.get(i));
            }
        }
    }
    public void afisarePF(){
        for(int i=0;i<lista.size();i++){
            if(lista.get(i) instanceof PersoanaFizica){
                System.out.println(lista.get(i));
            }
        }
    }
    public void afisareSuma(int x){
        for(int i=0; i<lista.size();i++){
            if(lista.get(i).cod==x){
                System.out.println("Fonduri insuficiente. Incercati sa extrageti o suma mai mica decat "+lista.get(i).suma+".");
            }
        }
    }
    public void adaugaCleint(Client c){
        lista.add(c);
        System.out.println("S-a adaugat clientul cu numele "+c.nume+", cu codul "+c.cod+" numarul de telefon "+c.telefon
                +" si bugetul de: "+c.suma + " lei.");
    }
    public void adaugaFirma(PersoanaJuridica c){
        lista.add(c);
        System.out.println("S-a adaugat firma cu numele "+c.nume+", cu codul-ul "+c.cod+", numarul de telefon "+c.telefon
                +", CUI-ul "+c.cui+" si bugetul de: "+c.suma + " lei.");
    }
    public void stergeClient(int x){
        for(int i=0; i<lista.size();i++){
            if(lista.get(i).cod==x){
                lista.remove(i);
                System.out.println("Eliminarea a fost facuta cu succes clientul cu codul: "+x+".");
            }
        }
    }
    public void imprumut(int x, double sum, int ani){
        for(int i=0; i<lista.size();i++)
        {
            if(lista.get(i).cod==x)
            {
                lista.get(i).suma=lista.get(i).suma+sum;
                System.out.println("Noul buget al firmei "+lista.get(i).nume+" este de "+lista.get(i).suma);
                System.out.println("Imprumutul este pe "+ani+"ani,cu o rata de "+lista.get(i).suma/ani+"cu o dobanda de 5%.");
            }
        }
    }
    public void depunere(int x, double sum){
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).cod==x){
                lista.get(i).suma=lista.get(i).suma+sum;
                System.out.println("S-au adaugat "+sum+" de lei. Bugetul curent este de "+lista.get(i).suma+".");
            }
        }
    }
    public void extragere(int x, double sum){
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).cod==x){
                lista.get(i).suma=lista.get(i).suma-sum;
                System.out.println("S-au extras "+sum+" de lei. Bugetul curent este de "+lista.get(i).suma+".");
            }
        }
    }
}
