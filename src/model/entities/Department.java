package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {

    private Integer id;
    private String name;

    public Department() {

    }

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    //---------------- GETTERS AND SETTERS ----------------------
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //---------------- HASHCODE AND EQUALS, TOSTRING ----------------------
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.id);
        hash = 13 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Department other = (Department) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name + '}';
    }

}
