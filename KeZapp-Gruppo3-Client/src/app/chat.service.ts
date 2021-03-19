import { Injectable } from '@angular/core';
import { Chat } from './chat';

@Injectable({
  providedIn: 'root'
})
export class ChatService {

  messaggio: string;

  chat: Chat = new Chat();

  constructor() { }
}
