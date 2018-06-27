package ru.otus;


public class Main {
    public static void main(String[] args) throws Exception {
        Departmant d = new Departmant();
        d.addAtm(new Atm(500, State.DISABLED));
        d.addAtm(new Atm(1000000, State.WORK));
        System.out.println("All Balance:" + d.getBalance());
        d.setAllPrimaryState();
        System.out.println("All Atm:" + d);
    }
}
