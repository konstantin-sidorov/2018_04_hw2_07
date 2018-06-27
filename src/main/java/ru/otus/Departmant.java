package ru.otus;

import java.util.ArrayList;

public class Departmant implements Visitor {
    private ArrayList<Component> bankomats;

    public Departmant() {
        this.bankomats = new ArrayList<Component>();
    }

    public Departmant(ArrayList<Component> bankomats) {
        this.bankomats = bankomats;
    }

    public void addAtm(Atm atm) {
        this.bankomats.add(atm);
    }

    @Override
    public void visit(Atm a) {
        a.setState(State.READY);
        a.setBalance(0);
    }

    public int getBalance() {
        int size = 0;
        for (Component m : this.bankomats) {
            size += m.getBalance();
        }
        return size;
    }

    public void setAllPrimaryState() {
        for (Component m : this.bankomats) {
            m.setPrimaryState(this);
        }
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this)
                .add("bankomats", bankomats)
                .toString();
    }
}
