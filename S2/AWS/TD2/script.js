/* If you're feeling fancy you can add interactivity 
    to your site with Javascript */
var tableau = Array(6);
var turn = 1;

for (var i = 0 ; i < 6 ; i++) {
    tableau[i] = Array(7);
    for (var j = 0 ; j < 7 ; j++) {
        tableau[i][j] = 0;
    }
}

/* À chaque clic, on change le contenu de #vide */



function set(row, column, player) {
   tableau[row][column] = player;
}

function render(){
  var element = document.querySelector("#tab");
  element.innerHTML = '';
  var table = document.createElement("table");   // Create a <button> element
  table.innerHTML = '';
  for(i = 0; i < 6; i++){
    var tr = document.createElement("tr");
    tr.innerHTML = '';
    table.appendChild(tr);
    for(j = 0; j < 7; j++){
      var td = document.createElement("td");
      if(tableau[i][j] == 1){
        td.className = 'j1';
      }
      if(tableau[i][j] == 2){
        td.className = 'j2';
      }
      table.appendChild(td);
    }
  }
  element.appendChild(table);             // Append <button> to <body
}

function play(column){
  for(i = 5; i != 0; i--){
    if(tableau[i][column] == 0){
      tableau[i][column] = turn;
      return i;
    }
  }
  return false;
}


// prints "hi" in the browser's dev tools console
render();
play(2);
render();
play(0);
render();
play(2);
render();

console.log(tableau);
