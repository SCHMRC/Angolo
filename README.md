# Esercizio di Java sugli Angoli <br>  
Si devono gestire degli oggetti di tipo Angolo nella forma g°p’s’’ dove g rappresentai gradi, p i primi ed s i secondi <br>
(con 0 <= g < 360°, 0 <= p < 60, 0 <= s < 60).<br>
Dopo aver prodotto il diagramma UML della classe Angolo la si implementi in linguaggio Java rendendo disponibili i seguenti metodi ( n rappresenta un valore intero , mentre a rappresenta un oggetto di tipo Angolo): 
 visualizzaAngolo() visualizza l’angolo nella forma g°p’s’’ 
 1. aggiungiGradi(n) aggiunge all’angolo n gradi 
 2. aggiungiPrimi(n) aggiunge all’angolo n primi 
 3. aggiungiSecondi(n) aggiunge all’angolo n secondi • angoloSecondi() ritorna il valore dell’angolo espresso in secondi 
 4. secondiAngolo(n) imposta il valore dell’angolo (gradi, primi e secondi) corrispondente a n secondi. 
 5. differenzaSecondi(a) restituisce la differenza espressa in secondi tra l’angolo e l’angolo a 
 6. sommaAngolo(a) somma all’angolo l’angolo a Si definisca inoltre un costruttore che accetti in ingresso tre parametri interi per il valore dei gradi, dei primi e dei secondi e un costruttore di copia.<br>
 
Quando aggiornati i valori degli attributi devono essere normalizzati rispettando i limiti imposti (360 per i gradi, 60 per i primi e i seondi). Implementare infine il metodo main dove sono istanziati due o più oggetti di tipo Angolo, in modo da verificare l’invocazione di ogni singolo metodo in diverse condizioni.
