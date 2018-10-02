package plugins.to;

import java.util.Comparator;
import java.util.Date;

/**
 * The Class Matches.
 */
public class Matches {

	/** The match id. */
	private String matchId;

	/** The season. */
	private String season;

	/** The city. */
	private String city;

	/** The date. */
	private Date date;

	/** The team 1. */
	private String team1;

	/** The team 2. */
	private String team2;

	/** The toss winner. */
	private String toss_winner;

	/** The toss decision. */
	private String toss_decision;

	/** The result. */
	private String result;

	/** The winner. */
	private String winner;

	/**
	 * Gets the match id.
	 *
	 * @return the match id
	 */
	public String getMatchId() {
		return matchId;
	}

	/**
	 * Sets the match id.
	 *
	 * @param matchId the new match id
	 */
	public void setMatchId(String matchId) {
		this.matchId = matchId;
	}

	/**
	 * Gets the season.
	 *
	 * @return the season
	 */
	public String getSeason() {
		return season;
	}

	/**
	 * Sets the season.
	 *
	 * @param season the new season
	 */
	public void setSeason(String season) {
		this.season = season;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the date.
	 *
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Sets the date.
	 *
	 * @param date the new date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Gets the team 1.
	 *
	 * @return the team 1
	 */
	public String getTeam1() {
		return team1;
	}

	/**
	 * Sets the team 1.
	 *
	 * @param team1 the new team 1
	 */
	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	/**
	 * Gets the team 2.
	 *
	 * @return the team 2
	 */
	public String getTeam2() {
		return team2;
	}

	/**
	 * Sets the team 2.
	 *
	 * @param team2 the new team 2
	 */
	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	/**
	 * Gets the toss winner.
	 *
	 * @return the toss winner
	 */
	public String getToss_winner() {
		return toss_winner;
	}

	/**
	 * Sets the toss winner.
	 *
	 * @param toss_winner the new toss winner
	 */
	public void setToss_winner(String toss_winner) {
		this.toss_winner = toss_winner;
	}

	/**
	 * Gets the toss decision.
	 *
	 * @return the toss decision
	 */
	public String getToss_decision() {
		return toss_decision;
	}

	/**
	 * Sets the toss decision.
	 *
	 * @param toss_decision the new toss decision
	 */
	public void setToss_decision(String toss_decision) {
		this.toss_decision = toss_decision;
	}

	/**
	 * Gets the result.
	 *
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * Sets the result.
	 *
	 * @param result the new result
	 */
	public void setResult(String result) {
		this.result = result;
	}

	/**
	 * Gets the winner.
	 *
	 * @return the winner
	 */
	public String getWinner() {
		return winner;
	}

	/**
	 * Sets the winner.
	 *
	 * @param winner the new winner
	 */
	public void setWinner(String winner) {
		this.winner = winner;
	}

	/** The matches. */
	public static Comparator<Matches> matches = new Comparator<Matches>() {

		public int compare(Matches m1, Matches m2) {

			int matches1 = Integer.valueOf(m1.getMatchId());

			int matches2 = Integer.valueOf(m2.getMatchId());

			return matches1 - matches2;

		}
	};

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Matches [matchId=" + matchId + ", season=" + season + ", city=" + city + ", date=" + date + ", team1="
				+ team1 + ", team2=" + team2 + ", toss_winner=" + toss_winner + ", toss_decision=" + toss_decision
				+ ", result=" + result + ", winner=" + winner + "]";
	}

}
