let jours = { 'mon' : 'Lundi',
              'tue' : 'Mardi',
              'wed' : 'Mercredi',
              'thu' : 'Jeudi',
              'fri' : 'Vendredi',
              'sat' : 'Samedi',
              'sun' : 'Dimanche' };

/****** Configuration *******/
// On charge le framework Express...
var express = require('express');
// On crée l'application web
var app = express();
// On configure Express pour servir les fichiers contenus dans public/
// à l'url /s
app.use('/s', express.static('public'));

const bodyP = require('body-parser');
app.use(bodyP.urlencoded({ extended: false }));
const cookieP = require('cookie-parser');
app.use(cookieP());

app.all('/', function(req, res) {
  var concat = '';
/**    for(var obj in jours){
      concat += obj + " = " + jours[obj] + "<br>";
    }**/
  
for(var obj in req._parsedUrl.query){
    concat += req._parsedUrl.query[obj] + "<br>";
  }
  
for(var obj in req.body){
    concat += obj + ' ' + req.body[obj] + "<br";
  }
  
for(var obj in req.headers){
    concat += req.headers[obj] + "<br>";
  }
  
for(var obj in req.cookies){
    concat += obj + ' ' + req.cookies[obj] + "<br";
  }
  res.send("hello! <br>" + concat);
});

app.get('/query_string', function(req, res){
  req._parsedUrl.query;
  res.send("Hello :)");
});

app.all('/headers', function(req, res){
  var concat = '';
  for(var obj in req.headers){
    concat += req.headers[obj] + "<br>";
  }
  res.send("Hello! <br>" + concat + '<br');
});

// On définit une route qui répond à toute url de la forme /blabla
// en répondant Hello blabla
app.get('/:n', function(req, res) {
    res.send('Hello <b>' + req.params.n + '</b>');
});

app.post('/form_data', function(req, res){
  var concat = '';
  for(var obj in req.body){
    concat += obj + ' ' + req.body[obj] + "<br";
  }
res.send(concat);

});

app.listen(process.env.PORT);





