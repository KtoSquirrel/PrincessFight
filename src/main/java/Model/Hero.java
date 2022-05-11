package Model;

import java.text.MessageFormat;
import java.util.Objects;

public class Hero {

    private String name;
    private double health;
    private double damageSkill;
    private double defenseSkill;

    public Hero(String name, double health, double damageSkill, double defenseSkill) {
        this.name = name;
        this.health = health;
        this.damageSkill = defenseSkill;
        this.defenseSkill = defenseSkill;
    }

    @Override
    public String toString(){
        return MessageFormat.format("Имя героя: {0}\nЗдоровье: {1}\nСкил атаки: {2}\nСкил защиты: {3}", name, health, damageSkill, defenseSkill);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return Double.compare(hero.health, health) == 0 && Double.compare(hero.damageSkill, damageSkill) == 0 && Double.compare(hero.defenseSkill, defenseSkill) == 0 && Objects.equals(name, hero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, health, damageSkill, defenseSkill);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDamageSkill() {
        return damageSkill;
    }

    public void setDamageSkill(double damageSkill) {
        this.damageSkill = damageSkill;
    }

    public double getDefenseSkill() {
        return defenseSkill;
    }

    public void setDefenseSkill(double defenseSkill) {
        this.defenseSkill = defenseSkill;
    }
}
