import { Component, OnInit } from '@angular/core';
import { Chat } from '../chat';

@Component({
  selector: 'app-tab-contatti',
  templateUrl: './tab-contatti.component.html',
  styleUrls: ['./tab-contatti.component.css']
})
export class TabContattiComponent implements OnInit {

  nickName: string;
  contatti: Chat[];

  constructor() { }

  ngOnInit(): void {
  }

  invia() {

  }

}
