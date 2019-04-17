import { Component } from '@angular/core';
import { HttpClientModule }    from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title : string;
  values : string;
  url : string;
  years : string[];
  countries : string[];

  constructor(){
    this.title = "The Kinder Life Expectancy Retriever 1.0 ";
    this.values = '';
    this.url = '';
    this.years = ["1990", "1991", "1992", "1993", "1994","1995","1996","1997","1998","1999"];
    this.countries = ["Germany", "France", "Niger", "Senegal", "Wonderland"];
  }

  onValidation(value: string, year: string) {
    this.values = value + year ;
  }

}
