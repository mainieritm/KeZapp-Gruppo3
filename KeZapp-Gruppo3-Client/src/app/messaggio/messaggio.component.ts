import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-messaggio',
  templateUrl: './messaggio.component.html',
  styleUrls: ['./messaggio.component.css']
})
export class MessaggioComponent implements OnInit {

  messaggio: string;

  constructor() { }

  ngOnInit(): void {
  }

  invia() {
    
  }

}
