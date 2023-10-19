package uos.capstone.epimetheus.dtos.llamaTasks;

public enum ResponseStreamProperty {

    TITLE("title"),
    DESCRIPTION("description"),
    CODE("code"),
    INTRO("introduction"),
    OUTRO("conclusion"),
    ERROR("error");


    private String property;

    ResponseStreamProperty(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }
}
