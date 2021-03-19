import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { ChatService } from '../chat.service';

@Component({
  selector: 'app-messaggio',
  templateUrl: './messaggio.component.html',
  styleUrls: ['./messaggio.component.css']
})
export class MessaggioComponent implements OnInit {

  @Input() messaggio: string;
  @Output() mess: EventEmitter<string> = new EventEmitter<string>();

  constructor(public chat: ChatService) { }

  ngOnInit(): void {
  }

  inviaTutti() {
    this.messaggio = this.chat.messaggio;
    this.mess.emit(this.messaggio);
  }
}
