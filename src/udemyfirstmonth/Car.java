package udemyfirstmonth;

public class Car extends Vehicle{
    int y;
    Car(){
        super(10);
    }
    Car(int y){
        super(y);
        this.y=y;

    }
    void show(){
        System.out.println("firstmonth.Car");
    };

    @Override
    public String toString() {
        return super.x + ": "+this.y;
    }
}
