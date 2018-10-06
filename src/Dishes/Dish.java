package Dishes;

import Exceptions.WrongMeasureException;

public class Dish {
    private String name;
    private short measure;

    private void setMeasure(short val) throws WrongMeasureException{
        if(val < 100 || val > 200) {
            throw new WrongMeasureException("The Dish Must be [100 ; 200] grams.");
        }
            this.measure = val;
    }

    public String getName() { return this.name; }
    public short getMeasure() { return this.measure; }


    public Dish(){ this((String)null, (short)100) ;}
    public Dish(Dish dish) {
        this.name = dish.name;
        try {
            setMeasure(measure);
        } catch (WrongMeasureException e) {
            e.printStackTrace();
        }
    }

    public Dish(String name ,short measure) {
        this.name = name;
        try {
            setMeasure(measure);
        } catch (WrongMeasureException e) {
            e.printStackTrace();
        }
    }
    public String toString() {
        return "[" + this.name + " | " + this.measure + "]";
    }
}
