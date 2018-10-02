package plugins.to;

import java.util.Comparator;

/**
 * The Class Deliveries.
 */
public class Deliveries {

	/** The match id. */
	private String matchId;

	/** The inning. */
	private String inning;

	/** The batting team. */
	private String battingTeam;

	/** The bowling team. */
	private String bowlingTeam;

	/** The over. */
	private String over;

	/** The ball. */
	private String ball;

	/** The bats man. */
	private String batsMan;

	/** The bowler. */
	private String bowler;

	/** The wide runs. */
	private String wideRuns;

	/** The bye runs. */
	private String byeRuns;

	/** The leg buy. */
	private String legBuy;

	/** The run. */
	private String run;

	/** The noball runs. */
	private String noballRuns;

	/** The penality runs. */
	private String penalityRuns;

	/** The bats man runs. */
	private String batsManRuns;

	/** The extra runs. */
	private String extraRuns;

	/** The total runs. */
	private String totalRuns;

	/** The economy. */
	private int economy;

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
	 * Gets the inning.
	 *
	 * @return the inning
	 */
	public String getInning() {
		return inning;
	}

	/**
	 * Sets the inning.
	 *
	 * @param inning the new inning
	 */
	public void setInning(String inning) {
		this.inning = inning;
	}

	/**
	 * Gets the batting team.
	 *
	 * @return the batting team
	 */
	public String getBattingTeam() {
		return battingTeam;
	}

	/**
	 * Sets the batting team.
	 *
	 * @param battingTeam the new batting team
	 */
	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}

	/**
	 * Gets the bowling team.
	 *
	 * @return the bowling team
	 */
	public String getBowlingTeam() {
		return bowlingTeam;
	}

	/**
	 * Sets the bowling team.
	 *
	 * @param bowlingTeam the new bowling team
	 */
	public void setBowlingTeam(String bowlingTeam) {
		this.bowlingTeam = bowlingTeam;
	}

	/**
	 * Gets the over.
	 *
	 * @return the over
	 */
	public String getOver() {
		return over;
	}

	/**
	 * Sets the over.
	 *
	 * @param over the new over
	 */
	public void setOver(String over) {
		this.over = over;
	}

	/**
	 * Gets the ball.
	 *
	 * @return the ball
	 */
	public String getBall() {
		return ball;
	}

	/**
	 * Sets the ball.
	 *
	 * @param ball the new ball
	 */
	public void setBall(String ball) {
		this.ball = ball;
	}

	/**
	 * Gets the bats man.
	 *
	 * @return the bats man
	 */
	public String getBatsMan() {
		return batsMan;
	}

	/**
	 * Sets the bats man.
	 *
	 * @param batsMan the new bats man
	 */
	public void setBatsMan(String batsMan) {
		this.batsMan = batsMan;
	}

	/**
	 * Gets the bowler.
	 *
	 * @return the bowler
	 */
	public String getBowler() {
		return bowler;
	}

	/**
	 * Sets the bowler.
	 *
	 * @param bowler the new bowler
	 */
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}

	/**
	 * Gets the wide runs.
	 *
	 * @return the wide runs
	 */
	public String getWideRuns() {
		return wideRuns;
	}

	/**
	 * Sets the wide runs.
	 *
	 * @param wideRuns the new wide runs
	 */
	public void setWideRuns(String wideRuns) {
		this.wideRuns = wideRuns;
	}

	/**
	 * Gets the bye runs.
	 *
	 * @return the bye runs
	 */
	public String getByeRuns() {
		return byeRuns;
	}

	/**
	 * Sets the bye runs.
	 *
	 * @param byeRuns the new bye runs
	 */
	public void setByeRuns(String byeRuns) {
		this.byeRuns = byeRuns;
	}

	/**
	 * Gets the leg buy.
	 *
	 * @return the leg buy
	 */
	public String getLegBuy() {
		return legBuy;
	}

	/**
	 * Sets the leg buy.
	 *
	 * @param legBuy the new leg buy
	 */
	public void setLegBuy(String legBuy) {
		this.legBuy = legBuy;
	}

	/**
	 * Gets the run.
	 *
	 * @return the run
	 */
	public String getRun() {
		return run;
	}

	/**
	 * Sets the run.
	 *
	 * @param run the new run
	 */
	public void setRun(String run) {
		this.run = run;
	}

	/**
	 * Gets the noball runs.
	 *
	 * @return the noball runs
	 */
	public String getNoballRuns() {
		return noballRuns;
	}

	/**
	 * Sets the noball runs.
	 *
	 * @param noballRuns the new noball runs
	 */
	public void setNoballRuns(String noballRuns) {
		this.noballRuns = noballRuns;
	}

	/**
	 * Gets the penality runs.
	 *
	 * @return the penality runs
	 */
	public String getPenalityRuns() {
		return penalityRuns;
	}

	/**
	 * Sets the penality runs.
	 *
	 * @param penalityRuns the new penality runs
	 */
	public void setPenalityRuns(String penalityRuns) {
		this.penalityRuns = penalityRuns;
	}

	/**
	 * Gets the bats man runs.
	 *
	 * @return the bats man runs
	 */
	public String getBatsManRuns() {
		return batsManRuns;
	}

	/**
	 * Sets the bats man runs.
	 *
	 * @param batsManRuns the new bats man runs
	 */
	public void setBatsManRuns(String batsManRuns) {
		this.batsManRuns = batsManRuns;
	}

	/**
	 * Gets the extra runs.
	 *
	 * @return the extra runs
	 */
	public String getExtraRuns() {
		return extraRuns;
	}

	/**
	 * Sets the extra runs.
	 *
	 * @param extraRuns the new extra runs
	 */
	public void setExtraRuns(String extraRuns) {
		this.extraRuns = extraRuns;
	}

	/**
	 * Gets the total runs.
	 *
	 * @return the total runs
	 */
	public String getTotalRuns() {
		return totalRuns;
	}

	/**
	 * Sets the total runs.
	 *
	 * @param totalRuns the new total runs
	 */
	public void setTotalRuns(String totalRuns) {
		this.totalRuns = totalRuns;
	}

	/**
	 * Gets the economy.
	 *
	 * @return the economy
	 */
	public int getEconomy() {
		return economy;
	}

	/**
	 * Sets the economy.
	 *
	 * @param economy the new economy
	 */
	public void setEconomy(int economy) {
		this.economy = economy;
	}

	/** The deliveries. */
	public static Comparator<Deliveries> deliveries = new Comparator<Deliveries>() {

		public int compare(Deliveries d1,Deliveries d2){

	int deliveries1=Integer.valueOf(d1.getMatchId());

	int deliveries2=Integer.valueOf(d2.getMatchId());

	return deliveries1-deliveries2;

	}};

	/** The economy result. */
	public static Comparator<Deliveries> economyResult = new Comparator<Deliveries>() {

		public int compare(Deliveries d1, Deliveries d2) {

			int economy1 = Integer.valueOf(d1.getEconomy());

			int economy2 = Integer.valueOf(d2.getEconomy());

			return economy1 - economy2;

		}
	};

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Deliveries [matchId=" + matchId + ", inning=" + inning + ", battingTeam=" + battingTeam
				+ ", bowlingTeam=" + bowlingTeam + ", over=" + over + ", ball=" + ball + ", batsMan=" + batsMan
				+ ", bowler=" + bowler + ", wideRuns=" + wideRuns + ", byeRuns=" + byeRuns + ", legBuy=" + legBuy
				+ ", run=" + run + ", noballRuns=" + noballRuns + ", penalityRuns=" + penalityRuns + ", batsManRuns="
				+ batsManRuns + ", extraRuns=" + extraRuns + ", totalRuns=" + totalRuns + "]";
	}

}
