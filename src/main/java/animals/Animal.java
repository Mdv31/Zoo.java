package animals;

import food.Food;

public abstract class Animal {
    private int satiety;

    public int getSatiety() {
        return satiety;
    }

    public int setSatiety(int k) {
        return this.satiety += k;
    }


    public abstract void eat(Food food);


}
