package task4.view;

import task4.presenter.Presenter;

public class ConsoleUI implements View {

    private final Presenter presenter;


    public ConsoleUI() {
        presenter = new Presenter(this);
    }

    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }

    /**
     * Последовательный Вызов методов вместо пользовательского меню:
     * - получить спискок сотрудников
     * - добавление нового сотрудника
     * - получить спискок сотрудников
     * - найти сотрудников по стажу
     * - найти телефоны по имени сотрудника
     * - найти сотрудника по табельному номеру
     */
    public void run() {
        getCurrentStafferList();
        addNewStaffer();
        getCurrentStafferList();
        findStafferByExperience();
        findPhoneByName();
        findStafferByNumber();
    }


    private void getCurrentStafferList() {
        presenter.getCurrentStafferList();
    }

    private void addNewStaffer() {
        presenter.addNewStaffer("Olga Olgova", "1234567", "9");
    }

    private void findStafferByExperience() {
        presenter.findStafferByExperience("14");
    }

    private void findPhoneByName() {
        presenter.findPhoneByName("Olga Olgova");
    }

    private void findStafferByNumber() {
        presenter.findStafferByNumber("2");
    }
}
