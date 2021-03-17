package it.iad.kezappgruppo3.serviceimpl;

import it.iad.kezappgruppo3.dto.RegistrazioneDto;
import it.iad.kezappgruppo3.dto.RichiediRegistrazioneDto;
import it.iad.kezappgruppo3.model.Chat;
import it.iad.kezappgruppo3.model.Messaggio;
import it.iad.kezappgruppo3.repository.ChatRepository;
import it.iad.kezappgruppo3.repository.MessaggioRepository;
import it.iad.kezappgruppo3.service.ChatService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {

    @Autowired
    ChatRepository chatRepository;
    
    @Autowired
    MessaggioRepository messaggioRepository;

    @Override
    public RegistrazioneDto registrazione(RichiediRegistrazioneDto dto) {
        //Cerco dentro Chat se esiste già il nickName
        List<Chat> contattiList = chatRepository.findByNicknameEquals(dto.getNickname());
        if (contattiList.size() == 0) {
            //Nickname non esiste e quindi creo un nuovo utente
            Chat chat = new Chat();
            chat.setNickname(dto.getNickname());
            // Salvo il nuovo utente nel database
            Chat chatSalvato = chatRepository.save(chat);
            // chatSalvato contiene id e nickname, dobbiamo salvare la sessione
            Long sessione = chatSalvato.getId();
            // assegno la sessione all'oggetto chat salvato
            chatSalvato.setSessione(sessione.toString());
            // Aggiorno il nuovo utente creato con la sessione
            chatRepository.save(chatSalvato);
            List<Chat> contatti;
            contatti = getContattiList();
            List<Messaggio> messaggi;
            messaggi = getMessaggiList(dto.getNickname());
            
            return new RegistrazioneDto(contatti, messaggi, sessione.toString());
        } else {
            return new RegistrazioneDto();
        }
        
    }
    
    private List<Chat> getContattiList(){
        return chatRepository.findAll();
    }
    
    private List<Messaggio> getMessaggiList(String nickName){
        return messaggioRepository.findByDestinatarioEqualsOrDestinatarioIsNull(nickName);
    }
}
