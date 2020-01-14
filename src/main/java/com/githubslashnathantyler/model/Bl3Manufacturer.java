package com.githubslashnathantyler.model;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "bl3_manufacturer")
@NamedQueries({
        @NamedQuery(name = "Bl3Manufacturer.findByName",
                query = "SELECT m FROM Bl3Manufacturer m WHERE m.name = :name"),
        @NamedQuery(name = "Bl3Manufacturer.findAll",
                query = "SELECT m FROM Bl3Manufacturer m")
})
public class Bl3Manufacturer {

    //public static final String TABLE_NAME = "bl3_manufacturer";

    @Id
    @GeneratedValue(generator = "manufacturer_id_generator")
    @SequenceGenerator(
            name = "manufacturer_id_generator",
            sequenceName = "manufacturer_id_sequence",
            initialValue = 1000
    )
    @Column(name = "manufacturer_id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "manufacturer_name", updatable = false, nullable = false)
    private String name;

    @Column(name = "is_pistol_maker", nullable = false)
    private Boolean pistolMaker;

    @Column(name = "is_smg_maker", nullable = false)
    private Boolean smgMaker;

    @Column(name = "is_sniper_maker", nullable = false)
    private Boolean sniperMaker;

    @Column(name = "is_ar_maker", nullable = false)
    private Boolean arMaker;

    @Column(name = "is_shotgun_maker", nullable = false)
    private Boolean shotgunMaker;

    @Column(name = "is_rl_maker", nullable = false)
    private Boolean rlMaker;

    @Column(name = "is_shield_maker", nullable = false)
    private Boolean shieldMaker;

    @Column(name = "is_grenade_maker", nullable = false)
    private Boolean grenadeMaker;

    public void setAll(String name, Boolean pistolMaker, Boolean smgMaker,
                       Boolean sniperMaker, Boolean arMaker, Boolean shotgunMaker,
                       Boolean rlMaker, Boolean shieldMaker, Boolean grenadeMaker) {
        this.name = name;
        this.pistolMaker = pistolMaker;
        this.smgMaker = smgMaker;
        this.sniperMaker = sniperMaker;
        this.arMaker = arMaker;
        this.shotgunMaker = shotgunMaker;
        this.rlMaker = rlMaker;
        this.shieldMaker = shieldMaker;
        this.grenadeMaker = grenadeMaker;
    }

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

    public Boolean getPistolMaker() {
        return pistolMaker;
    }

    public void setPistolMaker(Boolean pistolMaker) {
        this.pistolMaker = pistolMaker;
    }

    public Boolean getSmgMaker() {
        return smgMaker;
    }

    public void setSmgMaker(Boolean smgMaker) {
        this.smgMaker = smgMaker;
    }

    public Boolean getSniperMaker() {
        return sniperMaker;
    }

    public void setSniperMaker(Boolean sniperMaker) {
        this.sniperMaker = sniperMaker;
    }

    public Boolean getArMaker() {
        return arMaker;
    }

    public void setArMaker(Boolean arMaker) {
        this.arMaker = arMaker;
    }

    public Boolean getShotgunMaker() {
        return shotgunMaker;
    }

    public void setShotgunMaker(Boolean shotgunMaker) {
        this.shotgunMaker = shotgunMaker;
    }

    public Boolean getRlMaker() {
        return rlMaker;
    }

    public void setRlMaker(Boolean rlMaker) {
        this.rlMaker = rlMaker;
    }

    public Boolean getShieldMaker() {
        return shieldMaker;
    }

    public void setShieldMaker(Boolean shieldMaker) {
        this.shieldMaker = shieldMaker;
    }

    public Boolean getGrenadeMaker() {
        return grenadeMaker;
    }

    public void setGrenadeMaker(Boolean grenadeMaker) {
        this.grenadeMaker = grenadeMaker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bl3Manufacturer)) return false;
        Bl3Manufacturer that = (Bl3Manufacturer) o;
        return Objects.equals(getName(), that.getName()) &&
                Objects.equals(getPistolMaker(), that.getPistolMaker()) &&
                Objects.equals(getSmgMaker(), that.getSmgMaker()) &&
                Objects.equals(getSniperMaker(), that.getSniperMaker()) &&
                Objects.equals(getArMaker(), that.getArMaker()) &&
                Objects.equals(getShotgunMaker(), that.getShotgunMaker()) &&
                Objects.equals(getRlMaker(), that.getRlMaker()) &&
                Objects.equals(getShieldMaker(), that.getShieldMaker()) &&
                Objects.equals(getGrenadeMaker(), that.getGrenadeMaker());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPistolMaker(), getSmgMaker(),
                getSniperMaker(), getArMaker(), getShotgunMaker(),
                getRlMaker(), getShieldMaker(), getGrenadeMaker());
    }

    @Override
    public String toString() {
        return name;
    }

    public String generateInsert(String tableName) {
        return "INSERT INTO " + tableName +
                " (manufacturer_name, is_pistol_maker, " +
                "is_smg_maker, is_sniper_maker, is_ar_maker, " +
                "is_shotgun_maker, is_rl_maker, is_shield_maker, " +
                "is_grenade_maker) VALUES ('" + getName() + "', " +
                getPistolMaker() + ", " + getSmgMaker() + ", " +
                getSniperMaker() + ", " + getArMaker() + ", " +
                getShotgunMaker() + ", " + getRlMaker() + ", " +
                getShieldMaker() + ", " + getGrenadeMaker() + ");";
    }
}
