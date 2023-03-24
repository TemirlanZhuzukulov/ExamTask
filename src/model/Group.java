package model;

public class Group {
    private  int id;
    private  String name;
    private String description;
    private int year;

    public Group(int id, String name, String description, int year) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                '}';
    }
}
//    Жаны проект тузунуз.
//        2) 3 жаны пакет тузунуз - model, service, db.
//        3) model пакеттин ичине Group, Student деген класс тузунуз,Group свойствалары - int id, String name, String description, int year.
//        Student fullName, int age, Gender, Genderди enum кылып башка пакетке тузуп койсонуз болот.
//        4) db пакет тузунуз, пакеттин ичине Database деген класс тузунуз,
//        ичинде 2 свойствасы болот - groups, students. Бул класс биздин база
//        данных болот.
//        5) service пакеттин ичине GroupService деген жана StudentService тузунуз,  жана
//        impl деген пакет тузуп коюнуз.
//        6) GroupService