function saveMatch() {
    let code = document.querySelector('textarea').value;
    // Effettua qui la logica per salvare il codice del match
    alert('Match salvato correttamente');
  }
  axios
  .put('/match/{idMatch}/' + idMatch,  matchModel)
  .then(function(response) {
    // Gestisci la risposta del server dopo il salvataggio del match
    console.log(response.data); // Puoi fare qualcosa con la risposta, se necessario
    alert('Match salvato con successo!');
  })
  .catch(function(error) {
    // Gestisci eventuali errori durante la richiesta
    console.log(error);
    alert('Errore durante il salvataggio del match.');
  });