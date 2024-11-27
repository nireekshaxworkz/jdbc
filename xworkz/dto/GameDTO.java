package com.xworkz.dto;

import javax.persistence.*;

@Entity
@Table(name = "game_table")
public class GameDTO {
    @Id
    private int Id;
    @Column(name = "game_name")
    private String gameName;
    @Column(name = "no_of_players")
    private int noOfPlayers;
    @Column(name = "game_rules")
    private String gameRules;
    @Column(name = "team_leader_name")
    private String teamLeaderName;

    public GameDTO(int Id,String gameName,int noOfPlayers,String gameRules,String teamLeaderName) {
        this.Id = Id;
        this.gameName=gameName;
        this.noOfPlayers=noOfPlayers;
        this.gameRules=gameRules;
        this.teamLeaderName=teamLeaderName;
    }
    public GameDTO(){
        System.out.println("no agr const...");
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public String getGameRules() {
        return gameRules;
    }

    public void setGameRules(String gameRules) {
        this.gameRules = gameRules;
    }

    public String getTeamLeaderName() {
        return teamLeaderName;
    }

    public void setTeamLeaderName(String teamLeaderName) {
        this.teamLeaderName = teamLeaderName;
    }
}
