import { Component, platformCore } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title: string;
  values: string;
  url: string;
  years: string[];
  countries: string[];
  mapCoutries: any;
  options: string[];
  ws: WebSocket;
  data: string;

  constructor() {
    this.title = "The Kinder Life Expectancy Retriever 1.0 ";
    this.values = '';
    this.url = "ws://localhost:8887",
    this.years = ["1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999"];
    this.countries = ["Germany", "France", "Niger", "Senegal", "Wonderland"];
    this.mapCoutries = [["Germany","de"], ["France", "fr"], ["Niger", "ne"], ["Senegal", "se"]];
    this.data = '' ;
    this.openSocket();
  }
  onValidation(value: string, year: string) {
    this.data += value + year;
  }
  openSocket() {
    console.log('opening');
    var url = "ws://localhost:8887";
    this.ws = new WebSocket(url);
    this.ws.binaryType = 'arraybuffer'; // default is 'blob'
    this.ws.onopen = function() {
      console.log('open');
        sessionStorage.echoServer = url;
    };
    this.ws.onclose = function() {
      console.log('close');
    };
    this.ws.onmessage = function(e) {
        document.getElementById("data").innerHTML = e.data;
        
    };
    this.ws.onerror = function() {
      console.log('error');
    };

    this.ws.onerror = function () {
      console.log('error');
    };
  }
  closeSocket() {
    this.log('closing');
    this.ws.close();
  }

  sendText(pYearBegin, pYearEnd, pCountry) {
    let query = '<?xml version="1.0" encoding="UTF-8"?>'
    +'<model:Query'
    +  'xmi:version="2.0"'
    + 'xmlns:xmi="http://www.omg.org/XMI"'
    +  'xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"'
    + 'xmlns:model="http://www.example.org/model"'
    +  ' xsi:schemaLocation="http://www.example.org/model model.ecore"'
    +  ' ind="SP.POP.TOTL">';
    pCountry.forEach(country => {
        query += '<country name="' + this.mapCoutries.get(country)  + '"/>';
    });
    query += '<period begin="'+ pYearBegin + '" end="'+ pYearEnd +'"/>'
    + '</model:Query>'
    this.ws.send(query);
}
  log(message) {
            var li = document.createElement('li');
            li.innerHTML = message;
            document.getElementById('messages').appendChild(li);
        }
  // if(sessionStorage.echoServer) { 
  //    document.getElementById('server').value = sessionStorage.echoServer;
  //  }

  buildQuery() {
    
  }

}
