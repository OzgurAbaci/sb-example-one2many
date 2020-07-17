package nl.novi.dbexample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class WalkGroup {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String category;
    private boolean hasRoom;
    private double price;

    /**
     * Het toevoegen van een ManyToMany Relatie is heel simpel. Je maakt een verbinding in Java met een List of een Set
     * en je geeft deze relatie een naam. Vervolgens voeg je de annotatie @ManyToMany toe.
     */
    @ManyToMany
    private List<Dog> dogs;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isHasRoom() {
        return hasRoom;
    }

    public void setHasRoom(boolean hasRoom) {
        this.hasRoom = hasRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }
}
