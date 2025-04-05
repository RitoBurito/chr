package chernysh.entities.model;

import lombok.Getter;

@Getter
public enum WorkScheduleEnum {
    FULL_DAY(1, "Полный день"),
    SHIFT_SCHEDULE(2, "Сменный график"),
    FLEXIBLE_SCHEDULE(3, "Гибкий график"),
    REMOTE_WORK(4, "Удаленная работа"),
    SHIFT_METHOD(5, "Вахтовый метод");

    private final int code;
    private final String label;

    WorkScheduleEnum(int code, String label) {
        this.code = code;
        this.label = label;
    }
}
