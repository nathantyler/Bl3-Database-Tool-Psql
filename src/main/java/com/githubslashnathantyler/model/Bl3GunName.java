package com.githubslashnathantyler.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "bl3_gun_names")
public class Bl3GunName {

    public static final String TABLE_NAME = "bl3_gun_names";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "gun_name_id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "gun_type", nullable = false)
    private String type;

    @Column(name = "manufacturer_name", nullable = false)
    private String manufacturerName;

    @Column(name = "can_be_no_element", nullable = false)
    private Boolean canBeNoElement;

    @Column(name = "can_be_fire", nullable = false)
    private Boolean canBeFire;

    @Column(name = "can_be_corrosive", nullable = false)
    private Boolean canBeCorrosive;

    @Column(name = "can_be_shock", nullable = false)
    private Boolean canBeShock;

    @Column(name = "can_be_radiation", nullable = false)
    private Boolean canBeRad;

    @Column(name = "can_be_cryo", nullable = false)
    private Boolean canBeCryo;

    @Column(name = "can_world_drop", nullable = false)
    private Boolean canWorldDrop;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public Boolean isCanBeNoElement() {
        return canBeNoElement;
    }

    public void setCanBeNoElement(Boolean canBeNoElement) {
        this.canBeNoElement = canBeNoElement;
    }

    public Boolean isCanBeFire() {
        return canBeFire;
    }

    public void setCanBeFire(Boolean canBeFire) {
        this.canBeFire = canBeFire;
    }

    public Boolean isCanBeCorrosive() {
        return canBeCorrosive;
    }

    public void setCanBeCorrosive(Boolean canBeCorrosive) {
        this.canBeCorrosive = canBeCorrosive;
    }

    public Boolean isCanBeShock() {
        return canBeShock;
    }

    public void setCanBeShock(Boolean canBeShock) {
        this.canBeShock = canBeShock;
    }

    public Boolean isCanBeRad() {
        return canBeRad;
    }

    public void setCanBeRad(Boolean canBeRad) {
        this.canBeRad = canBeRad;
    }

    public Boolean isCanBeCryo() {
        return canBeCryo;
    }

    public void setCanBeCryo(Boolean canBeCryo) {
        this.canBeCryo = canBeCryo;
    }

    public Boolean isCanWorldDrop() {
        return canWorldDrop;
    }

    public void setCanWorldDrop(Boolean canWorldDrop) {
        this.canWorldDrop = canWorldDrop;
    }

    public String generateInsert() {
        return generateInsert(TABLE_NAME);
    }

    public String generateInsert(String tableName) {
        return "INSERT INTO " + tableName +
               " (name, manufacturer_name, gun_type, " +
               "can_be_no_element, can_be_fire, can_be_shock, " +
               "can_be_corrosive, can_radiation, can_be_cryo, " +
               "can_world_drop) VALUES (" + getName() + ", " +
               getManufacturerName() + ", " + getType() + ", " +
               isCanBeNoElement() + ", " + isCanBeFire() + ", " +
               isCanBeFire() + ", " + isCanBeShock() + ", " +
               isCanBeCorrosive() + ", " + isCanBeRad() + ", " +
               isCanBeCryo() + " " + isCanWorldDrop() + ");";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bl3GunName that = (Bl3GunName) o;
        return Objects.equals(getId(), that.getId()) &&
               Objects.equals(getType(), that.getType()) &&
               Objects.equals(getName(), that.getName()) &&
               Objects.equals(getManufacturerName(), that.getManufacturerName()) &&
               Objects.equals(isCanBeNoElement(), that.isCanBeNoElement()) &&
               Objects.equals(isCanBeFire(), that.isCanBeFire()) &&
               Objects.equals(isCanBeCorrosive(), that.isCanBeCorrosive()) &&
               Objects.equals(isCanBeShock(), that.isCanBeShock()) &&
               Objects.equals(isCanBeRad(), that.isCanBeRad()) &&
               Objects.equals(isCanBeCryo(), that.isCanBeCryo()) &&
               Objects.equals(isCanWorldDrop(), that.isCanWorldDrop());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getType(), getName(),
                            getManufacturerName(), isCanBeNoElement(),
                            isCanBeFire(), isCanBeCorrosive(), isCanBeShock(),
                            isCanBeRad(), isCanBeCryo(), isCanWorldDrop());
    }

}
