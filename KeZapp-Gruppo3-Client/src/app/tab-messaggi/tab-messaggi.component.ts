import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Chat } from '../chat';
import { Messaggio } from '../messaggio';

@Component({
  selector: 'app-tab-messaggi',
  templateUrl: './tab-messaggi.component.html',
  styleUrls: ['./tab-messaggi.component.css']
})
export class TabMessaggiComponent implements OnInit {

  @Input() messaggi: Messaggio[] = [];
  @Output() chat: EventEmitter<Chat> = new EventEmitter<Chat>();

  constructor() { }

  ngOnInit(): void {
  }

  aggiorna() {
    this.chat.emit();
  }

}
