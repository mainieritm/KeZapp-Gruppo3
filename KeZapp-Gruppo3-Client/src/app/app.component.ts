import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { InviaMessaggioDto } from './invia-messaggio-dto';
import { RegistrazioneDto } from './registrazione-dto';
import { RichiediMessaggiDto } from './richiedi-messaggi-dto';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  constructor(private http: HttpClient){}
  
  registrazioneVisible: boolean;
  chatVisible: boolean;
  messaggio: string;

  
  inviaTutti(){
    console.log("siamo nell'invia tutti");
    let dto: InviaMessaggioDto = new InviaMessaggioDto();
    dto.messaggio = this.messaggio;
    let mario: String;
    let oss: Observable<RegistrazioneDto> = this.http.post<RegistrazioneDto>("http://localhost:8080/invia-tutti", dto);
    oss.subscribe(p => console.log(p));
  }
}
