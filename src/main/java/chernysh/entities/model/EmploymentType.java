package chernysh.entities.model;

import lombok.Getter;

@Getter
public enum EmploymentType {
    FULL_TIME(1, "Полная занятость"),
    PART_TIME(2, "Частичная занятость"),
    PROJECT_EMPLOYMENT(3, "Проектная занятость"),
    VOLUNTEERING(4, "Волонтёрство"),
    INTERNSHIP(5, "Стажировка");

    private final int code;
    private final String label;

    EmploymentType(int code, String label) {
        this.code = code;
        this.label = label;
    }
}
