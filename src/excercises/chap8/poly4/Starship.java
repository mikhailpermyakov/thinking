package excercises.chap8.poly4;

import java.util.Random;

class AlertStatus{
    void report(){
    }
}

class Yellow extends AlertStatus{
    @Override
    void report(){
        System.out.println("Yellow");
    }
}

class Green extends AlertStatus{
    @Override
    void report() {
        System.out.println("Green");
    }
}

class Red extends AlertStatus{
    @Override
    void report() {
        System.out.println("Red");
    }
}

class Dashboard{
    private AlertStatus[] statuses = {new Red(), new Green(), new Yellow()};
    private int i;
    private AlertStatus alertStatus = statuses[i];

    void show(){
        System.out.println(".......Dashboard........");
        alertStatus.report();
    }

    void change(){
        i = new Random().nextInt(3);
        alertStatus = statuses[i > 0 ? i - 1 : 2];
    }
}

public class Starship {
    public static void main(String[] args) {
        Dashboard dashboard = new Dashboard();

        dashboard.show();
        dashboard.change();
        dashboard.show();
    }
}
