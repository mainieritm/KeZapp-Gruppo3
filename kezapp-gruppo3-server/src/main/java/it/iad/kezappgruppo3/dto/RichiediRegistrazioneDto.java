package it.iad.kezappgruppo3.dto;

public class RichiediRegistrazioneDto {

    private String nickname;

    public RichiediRegistrazioneDto() {
    }

    public RichiediRegistrazioneDto(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
