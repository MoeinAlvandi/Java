public enum DayStatus {
    STATUS(1000,"Ok"),
    NOOK(1002, "Error");

    public Integer code;
    public String description;


    DayStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
