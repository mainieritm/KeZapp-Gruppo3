import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-tab-messaggi',
  templateUrl: './tab-messaggi.component.html',
  styleUrls: ['./tab-messaggi.component.css']
})
export class TabMessaggiComponent implements OnInit {

  @Input() mittente: string;
  @Input() testo: string;

  constructor() { }

  ngOnInit(): void {
  }

  aggiorna() {
    
  }

}
