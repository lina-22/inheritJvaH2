package h2.com.jpainheritjoinedtable.model;

import javax.persistence.Entity;

@Entity
public class Archer extends Infantry {

    private Integer range;

    public Archer() {

    }


    public Archer(InfantryType type, Integer moveSpeed, Integer durability, Integer attack, Integer range) {
        super(type, moveSpeed, durability, attack);
        this.range = range;
    }
}
