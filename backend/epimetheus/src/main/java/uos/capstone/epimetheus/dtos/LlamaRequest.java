package uos.capstone.epimetheus.dtos;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class LlamaRequest {

    private List<Message> messages;
    private int temperature;
    private int max_tokens;
    private boolean stream;

    @Builder
    public LlamaRequest(List<Message> messages, int temperature, int max_tokens, boolean stream) {
        this.messages = messages;
        this.temperature = temperature;
        this.max_tokens = max_tokens;
        this.stream = stream;
    }
}
