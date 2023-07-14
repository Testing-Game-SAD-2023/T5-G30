let activeButton = null;
  
function makeButtonActive(buttonId) {
  let button = document.getElementById(buttonId);
  if (button) {
    if (activeButton) {
      activeButton.classList.remove('button-active');
    }
    button.classList.add('button-active');
    activeButton = button;

    // Abilita il pulsante "Select"
    document.getElementById('selectButton').disabled = false;
  }
}

function showMessage() {
  if (activeButton) {
    // Ottieni l'ID della classe selezionata
    let selectedClassId = activeButton.id;

    // Effettua la richiesta al backend utilizzando Axios
    axios.get(`/classes/chooseclass/${selectedClassId}`)
      .then(response => {
        // Mostra il messaggio di successo
        let message = document.getElementById('message');
        message.textContent = `Classe ${selectedClassId} scelta correttamente`;
      })
      .catch(error => {
        // Gestisci gli errori in caso di fallimento della richiesta
        console.error(error);
      });
  }
}
