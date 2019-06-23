var ws;
function openSocket() {
    log('opening');
    var url = document.getElementById('server').value;
    ws = new WebSocket(url);
    ws.binaryType = 'arraybuffer'; // default is 'blob'
    ws.onopen = function() {
        log('open');
        sessionStorage.echoServer = url;
    };
    ws.onclose = function() {
        log('close');
    };
    ws.onmessage = function(e) {

      var xmlTextNode = document.createTextNode(e);

      var racine = xmlTextNode.documentElement;
      alert(racine.hasChildNodes());
        document.getElementById("data").value = e.data;

    };
    ws.onerror = function() {
        log('error');
    };
}
function closeSocket() {
    log('closing');
    ws.close();
}

function sendText() {
  var anneesDebut = document.getElementById("thelistYearDebut");
  var anneeDebut = anneesDebut.options[anneesDebut.selectedIndex].value;
  console.log(anneeDebut);

  var anneesFin = document.getElementById("thelistYearFin");
  var anneeFin = anneesFin.options[anneesFin.selectedIndex].value;
  console.log(anneeFin);

  var pays = document.getElementById("thelistCountry");
  var paysSel = pays.options[pays.selectedIndex].value;
  console.log(paysSel);

  //  var indexYearB = thelistYearDebut.selectedIndex;
    //var anneeDebut = thelistYearDebut.options[indexYear].innerHTML;

  //  var indexYearE = thelistYearFin.selectedIndex;
  //  var anneeFin = thelistYearDebut.options[indexYearE].innerHTML;
  //  log('sending: ' + message);
    var xmlFormat = "<?xml version=\"1.0\" encoding=\"ASCII\"?>"+
						"<xmi:XMI xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:model=\"http://www.example.org/model\">" +
						 "<model:Query "+
							"xmi:version=\"2.0\" "+
							"xmlns:xmi=\"http://www.omg.org/XMI\" "+
							"xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "+
							"xmlns:model=\"http://www.example.org/model\" "+
							"xsi:schemaLocation=\"http://www.example.org/model model.ecore\" "+
							"ind=\"SP.POP.TOTL\">" +
						  "<country name=\""+paysSel+"\"/>" +
						  //"<country name=\"fr\"/>"+
						  //"<country name=\"be\"/>"+
						  "<period begin=\""+anneeDebut+"\" end=\""+anneeFin+"\"/>"+
						"</model:Query>"+
						"</xmi:XMI>";
    ws.send(xmlFormat);
}

function log(message) {
    var li = document.createElement('li');
    li.innerHTML = message;
    document.getElementById('messages').appendChild(li);
}
//construction charte



var arr = [
       ["Product 1", "2009", 1212],
       ["Product 2", "2009", 522],
       ["Product 1", "2010", 1337],
       ["Product 2", "2011", 711],
       ["Product 2", "2012", 2245],
       ["Product 3", "2012", 1000]
       ];


function getPivotArray(dataArray, rowIndex, colIndex, dataIndex) {
           var result = {}, ret = [];
           var newCols = [];
           for (var i = 0; i < dataArray.length; i++) {

               if (!result[dataArray[i][rowIndex]]) {
                   result[dataArray[i][rowIndex]] = {};
               }
               result[dataArray[i][rowIndex]][dataArray[i][colIndex]] = dataArray[i][dataIndex];

               //To get column names
               if (newCols.indexOf(dataArray[i][colIndex]) == -1) {
                   newCols.push(dataArray[i][colIndex]);
               }
           }

           newCols.sort();
           var item = [];

           //Add Header Row
           item.push('Performance');
           item.push.apply(item, newCols);
           ret.push(item);

           //Add content
           for (var key in result) {
               item = [];
               item.push(key);
               for (var i = 0; i < newCols.length; i++) {
                   item.push(result[key][newCols[i]] || 0);
               }
               ret.push(item);
           }
           return ret;
       }



google.load("visualization", "1.1", {packages:["bar"]});
google.setOnLoadCallback(drawChart);
function drawChart() {
  var productWiseData = google.visualization.arrayToDataTable(getPivotArray(arr, 0, 1, 2));
  var yearWiseData = google.visualization.arrayToDataTable(getPivotArray(arr, 1, 0, 2));

  var chart = new google.charts.Bar(document.getElementById('columnchart_product'));
  chart.draw(productWiseData,{});
   
}
