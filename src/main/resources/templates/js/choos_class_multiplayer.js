function makeButtonActive(buttonId) {
  let button = document.getElementById(buttonId);
  if (button) {
    let activeButtons = document.getElementsByClassName('button-active');
    for (let i = 0; i < activeButtons.length; i++) {
      activeButtons[i].classList.remove('button-active');
    }
    button.classList.add('button-active');
  }
}

function saveClass() {
  let activeButton = document.querySelector('.button-active');
  if (activeButton) {
    let className = activeButton.getAttribute('data-class-name');
    
    // Effettua la richiesta al backend utilizzando Axios
    axios.post('/classes/saveclass', { className: className })
      .then(response => {
        // Gestisci la risposta dal server, se necessario
        alert('Classe salvata: ' + className);
      })
      .catch(error => {
        // Gestisci gli errori in caso di fallimento della richiesta
        console.error(error);
      });
  } else {
    alert('Seleziona una classe prima di salvarla.');
  }
}
