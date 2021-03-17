package it.iad.kezappgruppo3.serviceimpl;

import it.iad.kezappgruppo3.dto.RegistrazioneDto;
import it.iad.kezappgruppo3.dto.RichiediRegistrazioneDto;
import it.iad.kezappgruppo3.model.Chat;
import it.iad.kezappgruppo3.repository.ChatRepository;
import it.iad.kezappgruppo3.service.ChatService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {

    @Autowired
    ChatRepository chatRepository;

    @Override
    public RegistrazioneDto registrazione(RichiediRegistrazioneDto dto) {
        List<Chat> contattiList = chatRepository.findByNicknameEquals(dto.getNickname());
        if (contattiList.size() == 0) {
            Chat chat = new Chat();
            chat.setNickname(dto.getNickname());
            chatRepository.save(chat);
        } else {
            //TODo
        }
        return new RegistrazioneDto();
    }
}
