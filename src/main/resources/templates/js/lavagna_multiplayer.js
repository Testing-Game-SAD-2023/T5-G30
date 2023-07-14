function saveGame() {
  var javaCode = document.getElementById('javaCode').value;
  var className = document.getElementById('className').innerText;
  var gameData = {
    javaCode: javaCode,
    className: className
  };

  // Effettua la richiesta al backend utilizzando Axios
  axios.post('/match/new', gameData)
    .then(response => {
      // Gestisci la risposta dal server, se necessario
      alert('Partita salvata con successo!');
    })
    .catch(error => {
      // Gestisci gli errori in caso di fallimento della richiesta
      console.error(error);
    });
}
