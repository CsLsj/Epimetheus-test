package uos.capstone.epimetheus.dtos;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Message {

    private String content;
    private String role;

    @Builder
    public Message(String content, String role) {
        this.content = content;
        this.role = role;
    }
}
