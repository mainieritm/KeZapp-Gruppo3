import { Component, Input, OnInit, EventEmitter, Output } from '@angular/core';
import { Chat } from '../chat';

@Component({
  selector: 'app-tab-contatti',
  templateUrl: './tab-contatti.component.html',
  styleUrls: ['./tab-contatti.component.css']
})
export class TabContattiComponent implements OnInit {

  @Input() nickname: string;
  @Input() contatti: Chat[];
  @Output() add: EventEmitter<string> = new EventEmitter<string>();

  constructor() { }

  ngOnInit(): void {
  }

  invia() {
    this.add.emit(this.nickname);
  }

}
