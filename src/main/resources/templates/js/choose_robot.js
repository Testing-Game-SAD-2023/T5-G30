let activeButton = null;

function makeButtonActive(buttonId) {
  let button = document.getElementById(buttonId);
  if (button) {
    if (activeButton) {
      activeButton.classList.remove('button-active');
    }
    button.classList.add('button-active');
    activeButton = button;

    // Abilita il pulsante "CHOOSE"
    document.getElementById('chooseButton').disabled = false;
  }
}

function displayMessage() {
  if (activeButton) {
    let selectedRobot = activeButton.id;

    // Effettua la richiesta al backend utilizzando Axios
    axios.get(`/robot/chooserobot/${selectedRobot}`)
      .then(response => {
        // Mostra il messaggio di successo
        alert(`Robot ${selectedRobot} scelto correttamente`);
      })
      .catch(error => {
        // Gestisci gli errori in caso di fallimento della richiesta
        console.error(error);
      });
  }
}
