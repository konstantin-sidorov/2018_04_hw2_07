package ru.otus;


import com.google.common.base.MoreObjects;

public class Atm implements Component {
    private int balance;
    private State state;

    @Override
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void setPrimaryState(Visitor v) {
        v.visit(this);
    }

    public Atm(int balance, State state) {
        this.balance = balance;
        this.state = state;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("balance", balance)
                .add("state", state)
                .toString();
    }
}

