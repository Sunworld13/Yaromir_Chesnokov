package Factory.Classes;

import java.util.Random;

public abstract class Character {
    private float healthPoint;
    private float manaPoint;
    private float strong;
    private float speed;

    public float getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(float healthPointMin, float healthPointMax) {
        this.healthPoint = Random(healthPointMin, healthPointMax);
    }

    public float getManaPoint() {
        return manaPoint;
    }

    public void setManaPoint(float manaPointMin, float manaPointMax) {
        this.manaPoint = Random(manaPointMin, manaPointMax);
    }

    public float getStrong() {
        return strong;
    }

    public void setStrong(float strongMin, float strongMax) {
        this.strong = Random(strongMin, strongMax);
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speedMin, float speedMax) {
        this.speed = Random(speedMin, speedMax);
    }

    private float Random (float minimum, float maximum)
    {
        Random rn = new Random();
        float randomNum = rn.nextFloat(maximum - minimum + 1) + minimum;
        return randomNum;
    }
}
