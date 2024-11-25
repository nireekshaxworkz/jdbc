package com.xworkz.sports.dto;
@Entity
@Table(name="Sports_table")
public class SportsDTO {
    @Id
    private int id;
    @Column(name="sports_name")
    private String sportsName;
    @Column(name="players")
    private int players;
    @column(name="inventer")
    private String inventer;
    @Column(name="rules")
    private String rules;

    public SportsDTO(int id,String sportsName,int players,String inventer,String rules) {
        this.id = id;
        this.sportsName=sportsName;
        this.players=players;
        this.inventer=inventer;
        this.rules=rules;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSportsName() {
        return sportsName;
    }

    public void setSportsName(String sportsName) {
        this.sportsName = sportsName;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public String getInventer() {
        return inventer;
    }

    public void setInventer(String inventer) {
        this.inventer = inventer;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }
}
