package task4.model.staffers;

public class Staffer {

    private int id;
    private int phoneNumber;
    private String name;
    private int experience;

    public Staffer(int phoneNumber, String name, int experience) {
        id = -1;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "Табельный номер: " + id +
                ", Номер телефона: " + phoneNumber +
                ", Имя: '" + name + '\'' +
                ", Стаж: " + experience +
                "\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
