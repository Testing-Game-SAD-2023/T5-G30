const chooseClassButton = document.querySelector('a[href="chooseclass"]');
const chooseRobotButton = document.getElementById('chooseRobotButton');
const startGameButton = document.getElementById('startGameButton');

// Disabilita il pulsante "CHOOSE ROBOT" e "START GAME" all'inizio
chooseRobotButton.disabled = true;
startGameButton.disabled = true;

// Aggiungi event listener per il click al pulsante "CHOOSE CLASS"
chooseClassButton.addEventListener('click', function() {
  // Abilita il pulsante "CHOOSE ROBOT" dopo la scelta della classe
  chooseRobotButton.disabled = false;
});

// Aggiungi event listener per il click al pulsante "CHOOSE ROBOT"
chooseRobotButton.addEventListener('click', function() {
  // Abilita il pulsante "START GAME" dopo la scelta del robot
  startGameButton.disabled = false;
});

// Event listener per il click al pulsante "START GAME"
startGameButton.addEventListener('click', function() {
  // Effettua la richiesta al backend utilizzando Axios
  axios.post('/match/new', { selectedClass: 'classe', selectedRobot: 'robot' })
    .then(response => {
      // Gestisci la risposta dal server, se necessario
      console.log(response.data);
    })
    .catch(error => {
      // Gestisci gli errori in caso di fallimento della richiesta
      console.error(error);
    });
});
