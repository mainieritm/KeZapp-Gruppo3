package it.iad.kezappgruppo3.controller;

import it.iad.kezappgruppo3.dto.InviaMessaggioDto;
import it.iad.kezappgruppo3.dto.RegistrazioneDto;
import it.iad.kezappgruppo3.dto.RichiediMessaggioDto;
import it.iad.kezappgruppo3.dto.RichiediRegistrazioneDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import it.iad.kezappgruppo3.service.KeZappService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@CrossOrigin("*")
public class KezappController {

    @Autowired
    KeZappService keZappService;

    @RequestMapping("/registrazione")
    @ResponseBody
    public RegistrazioneDto registrazione(@RequestBody RichiediRegistrazioneDto dto) {
        return keZappService.registrazione(dto);
    }

    @RequestMapping("/invia-tutti")
    @ResponseBody
    public RegistrazioneDto inviaTutti(@RequestBody InviaMessaggioDto dto) {
        return keZappService.inviaTutti(dto);
    }

    @RequestMapping("/invia-uno")
    @ResponseBody
    public RegistrazioneDto inviaUno(@RequestBody InviaMessaggioDto dto) {
        return keZappService.inviaUno(dto);
    }

    @RequestMapping("/aggiorna")
    @ResponseBody
    public RegistrazioneDto aggiorna(@RequestBody RichiediMessaggioDto dto) {
        return keZappService.aggiorna(dto);
    }
}
