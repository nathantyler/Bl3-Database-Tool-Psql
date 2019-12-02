package com.githubslashnathantyler.model;

import java.util.Objects;

public class Bl3Manufacturer {
    private Long id;
    private String name;
    private Boolean pistolMaker;
    private Boolean smgMaker;
    private Boolean sniperMaker;
    private Boolean arMaker;
    private Boolean shotgunMaker;
    private Boolean rlMaker;
    private Boolean shieldMaker;
    private Boolean grenadeMaker;

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
}
