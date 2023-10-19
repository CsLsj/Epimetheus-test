package uos.capstone.epimetheus.dtos;

import lombok.Builder;
import lombok.Getter;

import java.lang.annotation.Documented;
import java.util.List;

@Getter
public class Task {

    String intro;
    List<TaskStep> step;
    String outro;

    @Builder
    public Task(String intro, List<TaskStep> step, String outro) {
        this.intro = intro;
        this.step = step;
        this.outro = outro;
    }
}