import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistrazioneComponent } from './registrazione/registrazione.component';
import { MessaggioComponent } from './messaggio/messaggio.component';
import { TabContattiComponent } from './tab-contatti/tab-contatti.component';
import { TabMessaggiComponent } from './tab-messaggi/tab-messaggi.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    RegistrazioneComponent,
    MessaggioComponent,
    TabContattiComponent,
    TabMessaggiComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
