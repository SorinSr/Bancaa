import java.util.*;
public class Program {
    public static void main(String[] main) {
        try {
            while (true) {
                System.out.println("Introduceti comenzile: ");
                Scanner scan = new Scanner(System.in);
                String line = scan.nextLine();
                switch (line) {
                    case "exit":
                        System.out.println("Aplicatia se va inchide.");
                        return;
                    case "PF":
                        System.out.println("Introduceti datele pentru persoana fizica astfel: cod, nume, suma, telefon.");
                        String l1 = scan.nextLine();
                        String[] cmd1 = l1.split("\\s+");
                        PersoanaFizica p = new PersoanaFizica();
                        p.cod = Integer.parseInt(cmd1[0]);
                        p.nume = cmd1[1];
                        p.suma = Double.parseDouble(cmd1[2]);
                        p.telefon = Double.parseDouble(cmd1[3]);
                        Banca.getInstance().adaugaCleint(p);
                        break;
                    case "PJ":
                        System.out.println("Introduceti datele pentru persoana juridica in aceasta ordine: cod, nume, suma, telefon, CUI.");
                        String l2 = scan.nextLine();
                        String[] cmd2 = l2.split("\\s+");
                        PersoanaJuridica j = new PersoanaJuridica();
                        j.cod = Integer.parseInt(cmd2[0]);
                        j.nume = cmd2[1];
                        j.suma = Double.parseDouble(cmd2[2]);
                        j.telefon = Double.parseDouble(cmd2[3]);
                        j.cui = Integer.parseInt(cmd2[4]);
                        Banca.getInstance().adaugaFirma(j);
                        break;
                    case "afisareTot":
                        System.out.println("Se vor afisa toti clientii bancii: ");
                        Banca.getInstance().afisareClienti();
                        break;
                    case "afisarePJ":
                        System.out.println("Se vor afisa toate persoanele juridice: ");
                        Banca.getInstance().afisarePJ();
                        break;
                    case "afisarePF":
                        System.out.println("Se vor afisa toate persoanele fizice: ");
                        Banca.getInstance().afisarePF();
                        break;
                    case "afisareClient":
                        System.out.println("Introduceti codul clientului pe care doriti sa il afisati.");
                        String l3 = scan.nextLine();
                        String[] cmd3 = l3.split("\\s+");
                        Banca.getInstance().afisareClient(Integer.parseInt(cmd3[0]));
                        break;
                    case "sterge":
                        System.out.println("Introduceti codul clientului pe care doriti sa il eliminati.");
                        String l4 = scan.nextLine();
                        String[] cmd4 = l4.split("\\s+");
                        Banca.getInstance().stergeClient(Integer.parseInt(cmd4[0]));
                        break;
                    case "imprumut":
                        System.out.println("Introduceti codul clientului care vrea sa faca imprumutul, suma pe care o imprumuta " +
                                "si pe cati ani imrumuta banii.");
                        String l5 = scan.nextLine();
                        String[] cmd5 = l5.split("\\s+");
                        Banca.getInstance().imprumut(Integer.parseInt(cmd5[0]), Double.parseDouble(cmd5[1]), Integer.parseInt(cmd5[2]));
                        break;
                    case "depunere":
                        System.out.println("Introduceti codul clientului care vrea sa faca depunerea si suma pe care o depune.");
                        String l6 = scan.nextLine();
                        String[] cmd6 = l6.split("\\s+");
                        Banca.getInstance().depunere(Integer.parseInt(cmd6[0]), Double.parseDouble(cmd6[1]));
                        break;
                    case "extragere":
                        System.out.println("Introduceti codul clientului care vrea sa faca extragerea si suma pe care o extrage.");
                        String l7 = scan.nextLine();
                        String[] cmd7 = l7.split("\\s+");
                        try {
                            Banca.getInstance().extragere(Integer.parseInt(cmd7[0]), Double.parseDouble(cmd7[1]));
                        } catch (PreaPutiniBaniException e) {
                            Banca.getInstance().afisareSuma(Integer.parseInt(cmd7[0]));
                        }
                        break;
                    default:
                }
            }
        }
        catch(IndexOutOfBoundsException  e){}
    }
}
