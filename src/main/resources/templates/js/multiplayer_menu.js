function enableStartGameButton() {
  var chooseClassButton = document.getElementById('chooseClassButton');
  var invitePlayerButton = document.getElementById('invitePlayerButton');
  var startGameButton = document.getElementById('startGameButton');

  if (chooseClassButton.classList.contains('selected') && invitePlayerButton.classList.contains('invited')) {
    startGameButton.disabled = false;
  } else {
    startGameButton.disabled = true;
  }
}

var chooseClassButton = document.getElementById('chooseClassButton');
chooseClassButton.addEventListener('click', function() {
  chooseClassButton.classList.add('selected');
  enableStartGameButton();
});

var invitePlayerButton = document.getElementById('invitePlayerButton');
invitePlayerButton.addEventListener('click', function() {
  invitePlayerButton.classList.add('invited');
  enableStartGameButton();
});

var startGameButton = document.getElementById('startGameButton');
startGameButton.addEventListener('click', function() {
  // Effettua la richiesta al backend utilizzando Axios
  axios.post('/match/new', {})
    .then(response => {
      // Gestisci la risposta dal server, se necessario
      console.log(response.data);
    })
    .catch(error => {
      // Gestisci gli errori in caso di fallimento della richiesta
      console.error(error);
    });
});
