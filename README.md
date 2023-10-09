# T5-G30
## Testing Game
### :desktop_computer: Traccia
Il giocatore (dopo essersi autenticato) avvia una nuova partita del Primo Scenario, l’applicazione gli mostra un elenco di classi da testare ed un elenco di Robot disponibili, il giocatore sceglie la classe ed il Robot contro cui confrontarsi. A questo punto il sistema crea la partita con tutte le scelte fatte, le associa un IdPartita, e la salva. Successivamente l’applicazione avvia l’ambiente di editing in cui visualizza la classe da testare e gli offre una finestra in cui può scrivere la classe di test.
#### :man_technologist: Membri del gruppo
* Danilo Romano M63001542
* Alfonso D'avino M63001533
* Mario Tranchese M63001533
* Francesco Riccardi M63001372
* Valerio Maietta M63001407




### :floppy_disk: Installazione
#### :bangbang: Prerequisiti
* Abilitare WSL (Solo per Windows)
* Docker Engine oppure Docker Desktop
* Maven
  
```bash
cd t5
mvn package
```
Dopo aver creato il file .jar
```bash
cd target
docker build -t test -f test.dockerfile .
docker run -d -p 8080:8080 --name test_container-name test
```
Per visualizzare delle informazioni relative all' applicazione in esecuzione:
```bash
docker ps
```
### link DOCUMENTAZIONE:  https://communitystudentiunina-my.sharepoint.com/:w:/g/personal/alfonso_davino_studenti_unina_it/EaFPiFTcvj1OhqpleMcsUkwBPnzyH9G40PQvXN_UUGpsyg?e=SUdIPU


### :handshake: Integrazione
* T2-3 :point_right: [G1](https://github.com/Testing-Game-SAD-2023/T23-G1.git)
* T6 :point_right: [G12](https://github.com/Testing-Game-SAD-2023/T6-G12.git)





