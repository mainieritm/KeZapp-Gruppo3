import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { Chat } from './chat';
import { ChatService } from './chat.service';
import { InviaMessaggioDto } from './invia-messaggio-dto';
import { Messaggio } from './messaggio';
import { RegistrazioneDto } from './registrazione-dto';
import { RichiediMessaggiDto } from './richiedi-messaggi-dto';
import { RichiediRegistrazioneDto } from './richiedi-registrazione-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  constructor(private http: HttpClient, public chat: ChatService) { }

  registrazioneVisible: boolean;
  chatVisible: boolean;
  messaggi: Messaggio[] = [];
  reg: RegistrazioneDto = new RegistrazioneDto();
  contatti: Chat[] = [];
  risposta: string;

  inviaTutti(m: string) {
    console.log("siamo nell'invia tutti");
    console.log(m);
    console.log(this.chat.chat);
    let dto: InviaMessaggioDto = new InviaMessaggioDto();
    dto.messaggio = m;
    dto.sessione = this.chat.chat.sessione;
    let oss: Observable<RegistrazioneDto> = this.http.post<RegistrazioneDto>("http://localhost:8080/invia-tutti", dto);
    oss.subscribe(p => {
      this.reg = p;
      this.contatti = this.reg.contatti;
      this.messaggi = this.reg.messaggi;
    });
    m = "";
    this.risposta = "Messaggio inviato a tutti"; 
  }

  aggiorna() {
    console.log("aggiorna funziona!!! (forse)");
    let dto: RichiediMessaggiDto = new RichiediMessaggiDto();
    dto.sessione = this.chat.chat.sessione;
    let oss: Observable<RegistrazioneDto> = this.http.post<RegistrazioneDto>("http://localhost:8080/aggiorna", dto);
    oss.subscribe(c => {
      this.reg = c;
      this.contatti = this.reg.contatti;
      this.messaggi = this.reg.messaggi;
      console.log(this.reg.messaggi);
    });
  }

  registra(n: string) {
    console.log("Registra!!")
    let dto: RichiediRegistrazioneDto = new RichiediRegistrazioneDto();
    dto.nickname = n;
    let oss: Observable<RegistrazioneDto> = this.http.post<RegistrazioneDto>("http://localhost:8080/registrazione", dto);
    oss.subscribe(c => {
      this.reg = c;
      this.contatti = this.reg.contatti;
      this.messaggi = this.reg.messaggi;
      this.chat.chat = new Chat();
      this.chat.chat.sessione = this.reg.sessione;
      console.log(this.reg.sessione + " sessione");
      this.chat.chat.nickname = n;
    });
  }

  invia(c: Chat) {
    let dto: InviaMessaggioDto = new InviaMessaggioDto();
    dto.messaggio = this.chat.messaggio;
    dto.sessione = this.chat.chat.sessione;
    dto.destinatario = c.nickname;
    let oss: Observable<RegistrazioneDto> = this.http.post<RegistrazioneDto>("http://localhost:8080/invia-uno", dto);
    oss.subscribe(p => {
      this.reg = p;
      this.contatti = this.reg.contatti;
      this.messaggi = this.reg.messaggi;
    });
    this.chat.messaggio = "";
    this.risposta = "Messaggio inviato a " + c.nickname;
  }
}
