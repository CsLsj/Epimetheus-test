package uos.capstone.epimetheus.dtos.llamaTasks;

import lombok.Getter;

@Getter
public enum CodeLanguage {

    JAVASCRIPT("javascript"),
    JAVA("java"),
    PYTHON("python"),
    DEFAULT("default");

    private String language;

    CodeLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public static CodeLanguage of(String language) {
        for (CodeLanguage codeLanguage : CodeLanguage.values()) {
            if (codeLanguage.getLanguage().equalsIgnoreCase(language)) {
                return codeLanguage;
            }
        }
        return DEFAULT;
    }
}
