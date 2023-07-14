// Ottieni i riferimenti agli elementi delle modalità di gioco
const singlePlayerLink = document.getElementById('singlePlayerMode');
const multiPlayerLink = document.getElementById('multiPlayerMode');
// Ottieni l'informazione della modalità di gioco dal localStorage
const gameMode = localStorage.getItem('gameMode');

// Aggiungi event listener per il click
singlePlayerLink.addEventListener('click', function() {
  // Salvare l'informazione della modalità di gioco nel localStorage
  localStorage.setItem('gameMode', 'singlePlayer');

  // Esegui l'azione desiderata, ad esempio inviare la modalità di gioco al backend
  sendGameModeToBackend('singlePlayer');
});

multiPlayerLink.addEventListener('click', function() {
  // Salvare l'informazione della modalità di gioco nel localStorage
  localStorage.setItem('gameMode', 'multiPlayer');

  // Esegui l'azione desiderata, ad esempio inviare la modalità di gioco al backend
  sendGameModeToBackend('multiPlayer');
});

// Funzione per inviare la modalità di gioco al backend utilizzando Axios
function sendGameModeToBackend(mode) {
  axios.post('/match/new', { mode: mode })
    .then(response => {
      // Gestisci la risposta dal server, se necessario
      console.log(response.data);
    })
    .catch(error => {
      // Gestisci gli errori in caso di fallimento della richiesta
      console.error(error);
    });
}

if (gameMode === 'singlePlayer') {
  // Modalità Single Player
  // Esegui le azioni desiderate
  console.log('Modalità Single Player');
} else if (gameMode === 'multiPlayer') {
  // Modalità Multiplayer
  // Esegui le azioni desiderate
  console.log('Modalità Multiplayer');
}
