package com.isep.rpg;

public abstract class Combatant {

    public Combatant(String n, int h, int a) {
        name = n;
        healthPoint = h;
        attackPoint = a;
    }
    public void eat(Food food){
        this.healthPoint += food.getEffect();
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }
    public int getAttackPoint(){ return attackPoint;}

    public void loose(int hp) {
        healthPoint -= hp;
        // ... équivalant à : healthPoint = healthPoint - hp;
    }
    // Chaque "vrai" combatant (non "abstract") implémente un code différent
    // pour la méthode "fight"
    public  void fight(Combatant combatant){
        if(combatant.getHealthPoint() > this.getHealthPoint()){
            combatant.win();
            this.loose(combatant.getAttackPoint());
            if (!this.isAlive()){
                System.out.println(this.getName() + " is dead");
            }

        }
        if (combatant.getHealthPoint() == this.getHealthPoint()) {
            combatant.loose(this.getAttackPoint());
            this.loose(combatant.getAttackPoint());
            if (!combatant.isAlive()){
                System.out.println(combatant.getName() + " is dead");
            }
            if (!this.isAlive()){
                System.out.println(this.getName() + " is dead");
            }
        }
        else{
            combatant.loose(this.getAttackPoint());
            this.win();
            if (!combatant.isAlive()){
                System.out.println(combatant.getName() + " is dead");
            }
        }
    };
    public boolean isAlive(){
        if (getHealthPoint() > 0)
            return true;
        else return false;
    }
    public void win(){
        healthPoint += 1;
    }
    private String name;
    protected int healthPoint;
    protected int attackPoint;

}
