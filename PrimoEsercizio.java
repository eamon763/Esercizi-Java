
import java.util.Scanner;

public class PrimoEsercizio {
        
    /*   Lo scopo è avere un programma che ci permette di lavorare e modificare le matrici
        Nel main, leggi le dimensioni N e M dall'utente
        Fai un metodo che crea una matrice NxM riempita di numeri casuali da 0 a 99 (inclusi), e
        chiamalo nel main
        A questo punto, presenta all'utente una lista di comandi (il "menu")
        Trasposta: scrive a schermo la matrice trasposta
        ScambiaRighe: chiede due indici di riga, mostra a schermo la matrice con le righe
        scambiate. Salva la matrice (dal prossimo comando usiamo questa matrice modificata)
        ScambiaColonne: vedi ScambiaRighe
        SommaRighe: stampa la somma dei valori di ogni riga
        SommaColonne: vedi SommaColonne
        Esci: termina il programma
        Il programma deve terminare solo quando l'utente sceglie l'opzione "Esci". Altrimenti, dopo ogni
        comando, mostra nuovamente il "menu"
        Ogni comando deve usare un metodo statico per generare la matrice/array richiesto, l'output
        avviene solo nel main
 */

public static 

public static void main(String[] args) {
        System.out.println("Ciao, mondo!");
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci il numero di righe (N): ");
        int N = in.nextInt();
        System.out.print("Inserisci il numero di colonne (M): ");   
        int M = in.nextInt();
        int[][] matrice = creaMatriceCasuale(N, M);
    }
}
