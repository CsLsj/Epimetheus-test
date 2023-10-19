package uos.capstone.epimetheus.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

//TODO: 불필요한 어노테이션 지우고 필요한거만 하기

@Getter
public class LlamaResponse {
        private List<Choices> choices;

        //TODO: public static class 말고 새로운 클래스 만들고, 그거 쓰기
        public String parseContent() {
                try {
                        return choices.get(0).getDelta().getContent();
                } catch (NullPointerException e) {
                        return "";
                }
        }


}
@Getter
class Choices {
        private int index;
        private Delta delta;

};
@Getter
class Delta {
        private String role;
        private String content = "";
}
