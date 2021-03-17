import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-messaggio',
  templateUrl: './messaggio.component.html',
  styleUrls: ['./messaggio.component.css']
})
export class MessaggioComponent implements OnInit {

  @Input() messaggio: string;
  @Output() mess: EventEmitter<string> = new EventEmitter<string>();

  constructor() { }

  ngOnInit(): void {
  }

  inviaTutti() {
    this.mess.emit(this.messaggio);
  }
}
