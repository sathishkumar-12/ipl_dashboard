package ipl.ipl_dashboard.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Match{
    @Id
    private long id;
    private String city;
    private LocalDate date;
    private String player_of_match;
    private String venue;
    private String team1;
    private String team2;
    private String toss_winner;
    private String toss_decision;
    private String winner;
    private String result;
    private String result_margin;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getPlayer_of_match() {
        return player_of_match;
    }
    public void setPlayer_of_match(String player_of_match) {
        this.player_of_match = player_of_match;
    }
    public String getVenue() {
        return venue;
    }
    public void setVenue(String venue) {
        this.venue = venue;
    }
    public String getTeam1() {
        return team1;
    }
    public void setTeam1(String team1) {
        this.team1 = team1;
    }
    public String getTeam2() {
        return team2;
    }
    public void setTeam2(String team2) {
        this.team2 = team2;
    }
    public String getToss_winner() {
        return toss_winner;
    }
    public void setToss_winner(String toss_winner) {
        this.toss_winner = toss_winner;
    }
    public String getToss_decision() {
        return toss_decision;
    }
    public void setToss_decision(String toss_decision) {
        this.toss_decision = toss_decision;
    }
    public String getWinner() {
        return winner;
    }
    public void setWinner(String winner) {
        this.winner = winner;
    }
    public String getResult() {
        return result;
    }
    public void setResult(String result) {
        this.result = result;
    }
    public String getResult_margin() {
        return result_margin;
    }
    public void setResult_margin(String result_margin) {
        this.result_margin = result_margin;
    }
    
}
