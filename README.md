# ProgettoFondamentiDiProgrammazioneWeb

Specifiche del Progetto di fine corso - Fondamenti di programmazione web

L’associazione AVIS di Cagliari vuole realizzare un’applicazione web per la gestione delle prenotazioni e dell’archiviazione
delle donazioni di sangue nella propria città.

L’applicazione deve prevedere due tipi di accesso: utente semplice e amministratore.

Senza effettuare nessun accesso si può visualizzare solo l’elenco delle sessioni di donazione disponibili nella città. 

L’utente semplice può registrarsi all'applicazione, scegliendo uno username (che deve essere univoco) e una password, e
caricando tutti i suoi dati anagrafici. In particolare, ogni utente deve caricare: nome, cognome, data di nascita, codice
fiscale, sesso, e-mail, numero di cellulare, gruppo sanguigno, eventuali patologie (in un campo di testo libero, stile note).

L’utente semplice può prenotarsi per una sessione di donazione disponibile sull’applicazione, scegliendo uno degli slot da
mezz'ora tra quelli previsti per il giorno della donazione. NB: per ogni slot da mezz’ora si può prenotare un solo utente.
Ovviamente un utente semplice si può prenotare solo se rispetta i vincoli previsti per le donazioni*.

L’utente semplice ha accesso alla sua pagina personale, da cui può visualizzare e modificare le sue informazioni personali.

L’utente semplice ha accesso a una pagina in cui può visualizzare la lista delle sue donazioni effettuate nel tempo.

L’amministratore (il responsabile della sede di Cagliari), con il suo account da amministratore (creato da chi realizza
l’applicazione) può inserire nuove sessioni di donazioni, specificando una data, un orario di inizio e uno di fine, e un luogo.

L’amministratore può anche, una volta terminata una sessione di donazioni, archiviare tutte le donazioni ricevute. In
particolare, a partire dalle prenotazioni ricevute per il giorno, può analizzare una a una le prenotazioni di donazioni e
decidere se renderle permanenti in archivio (nel caso di donazione avvenuta con successo) o eliminarla (nel caso in cui la
persona non si sia presentata o nel caso in cui non sia stato possibile procedere con la donazione). In particolare, per ogni
donazione da confermare, l’amministratore memorizza l’utente, la data, la quantità di sangue prelevato e eventuali note in
formato testuale.

Per comprendere meglio questa feature si consideri il seguente esempio:

Gli utenti semplici Mario e Dino prenotano entrambi una donazione per il giorno 13/12/2021. Il giorno 13/12/2021 Mario
effettua la donazione regolarmente, mentre Dino non si presenta. L'amministratore, in una data successiva al 13/12/2021
processa tutte le prenotazioni del 13/12/2021. Sia la prenotazione di Mario che quella di Dino vengono rimosse dall’elenco
delle prenotazioni. La prenotazione di Mario viene inserita tra le donazioni effettuate, con i relativi dati, mentre quella di
Dino non viene inserita da nessuna parte (è stata quindi semplicemente rimossa dall’elenco delle prenotazioni).

L’amministratore ha a disposizione anche una schermata in cui può vedere la lista di tutti i donatori, con i loro dati e il
numero di donazioni effettuate. L’elenco di donatori e rispettive donazioni effettuate è ordinabile alfabeticamente per
cognome o per numero di donazioni (crescenti o decrescenti). L’amministratore può scegliere l’ordine da un menù. 

*Nelle donazioni del sangue, un uomo può donare 4 volte l’anno, una donna 2 volte l’anno. In ogni caso, tra una donazione
e la successiva devono trascorrere 90 giorni.

---------------------------------------------------------------------------------------------------------------------------------

Le credenziali dell’utente amministratore del sito:
username: sainas
password: 66058

----------------------------------------------------------------------------------------------------------------------------------

Realizzate il programma tenendo in considerazione che l’utente semplice e l’amministratore non sono utilizzatori esperti.
L’applicazione web deve quindi aiutare gli utenti nell’interazione, con suggerimenti e avvisi di errori opportunamente
gestiti.

