package guis;

/**
 * Write a description of class CARE here.
 *
 * @CS58
 * @version 13/03/24
 */
public interface CARE
{
    /**
     * Returns all details of the tournament:
     * - Teams
     * - Scores
     * - Treasury balance
     */
    public String toString();
    
    /**
     * Returns a string with details about the champion
     * @param championID - id number of the champion
     * - Name
     * - ID
     * - Types
     * - Team ID (if applicable)
     * - Entry fee
     * - State
     */
    public String getChampionDetails(int championID);
    
    /**
     * Returns a string with details about the team
     * @param teamID - id number of the team
     * - ID
     * - Size
     * - List of champions
     * - Win/rate ratio
     */
    public String getTeamDetails(int teamID);
    
    /**
     * Returns an int with treasury amount in goulds
     */
    public int getTreasury();
    
    /**
     * Returns a string with current team score
     */
    public String getScore();
    
    /**
     * @param teamID - id number of the team
     * Returns true if a team has space to recruit new champions
     * A recruitment can be made if there is space in the team
     */
    public boolean canRecruit(int teamID);
    
    /**
     * @param championID - id number of the champion
     * Returns true if there is more than one other champion left in the team
     * False if the champion trying to retire is the only one left
     */
    public boolean canRetire(int championID);
    
    /**
     * Returns a string for retiring a champion
     */
    public String retireChampion(int championID);
}
