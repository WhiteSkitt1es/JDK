package task4.model.staffers;

import java.util.ArrayList;
import java.util.List;

public class StafferList<E extends Staffer> {

    protected int id = 1;
    protected List<E> stafferList;

    public StafferList() {
        stafferList = new ArrayList<>();
    }

    public boolean addStafferToList(E e) {
        if (e == null) {
            return false;
        }
        if (!stafferList.contains(e)) {
            stafferList.add(e);
            e.setId(id++);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nСправочник сотрудников: \n" + stafferList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<E> getStafferList() {
        return stafferList;
    }

    public void setStafferList(List<E> stafferList) {
        this.stafferList = stafferList;
    }
}
