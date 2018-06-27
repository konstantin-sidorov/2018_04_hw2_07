package ru.otus;


public interface Component {
    void setPrimaryState(Visitor v);

    int getBalance();
}
