package plugins.excel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

import plugins.to.Deliveries;
import plugins.to.Helper;
import plugins.to.Matches;

/**
 * The Class ReadExcelData.
 */
public class ReadExcelData {
	
	private static final Logger LOG = Logger.getLogger(ReadExcelData.class);

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		try {
		
			final List<Matches> matchesList = Helper.getMatchesData();
	
			Collections.sort(matchesList, Matches.matches);
	
			LOG.info(" Matches Size() :: " + matchesList.size());
	
			// Solution-1
			getTeamNamesWhoElectedFieldFirst(matchesList);
	
			List<Deliveries> deliveriesList = Helper.getDeliveriesData();
			LOG.info("Deliveries Size() :: " + deliveriesList.size());
	
			// Solution - 3
			getBestEconmyPlayer(matchesList, deliveriesList);
			
		}
		catch(final Exception ex) {
			LOG.error("Exception occured due to : "+ex.getMessage());
		}

	}

	/**
	 * Gets the team names who elected field first.
	 *
	 * @param matchesList the matches list
	 * @return the team names who elected field first
	 */
	private static void getTeamNamesWhoElectedFieldFirst(final List<Matches> matchesList) {

		int count = 0;

		for (final Matches matches : matchesList) {

			final Map<String, String> topFourTeamMap = new HashMap<>();

			if ((Integer.valueOf(matches.getSeason()) == 2016 || Integer.valueOf(matches.getSeason()) == 2017)) {

				topFourTeamMap.put("YEAR", matches.getSeason());
				topFourTeamMap.put("TEAM", matches.getToss_winner());
				count = count + 1;
			}

			LOG.info(" Year" + "  |  " + "Team ");

			LOG.info(" ====================================== ");

			LOG.info(topFourTeamMap.get("YEAR") + " |  " + topFourTeamMap.get("TEAM"));

			if (count == 4) {
				break;
			}

		}
	}

	/**
	 * Gets the best econmy player.
	 *
	 * @param matchesList the matches list
	 * @param deliveriesList the deliveries list
	 * @return the best economy player
	 */
	@SuppressWarnings({ "unchecked", "unlikely-arg-type" })
	private static void getBestEconmyPlayer(final List<Matches> matchesList, final List<Deliveries> deliveriesList) {

		final ArrayList<Object> economyList = new ArrayList<>();

		final Map<String, List<Object>> economyResult = new HashMap<>();

		int count = 0;

		for (final Matches match : matchesList) {

			Deliveries delivery = null;

			if (deliveriesList.contains(match.getMatchId())) {

				delivery = deliveriesList.get(Integer.valueOf(match.getMatchId()));

				final int economy = Integer.valueOf(delivery.getTotalRuns()) / Integer.valueOf(delivery.getOver());

				delivery.setEconomy(economy);

				economyList.add(economy);
				economyList.add(match.getSeason());
				economyList.add(delivery.getBowler());
			}
			economyResult.put(match.getMatchId(), economyList);
		}

		LOG.info("economyResult :: " + economyResult);

		@SuppressWarnings("rawtypes")
		final List sortedList = new ArrayList<>();

		for (final Entry<String, List<Object>> entry : economyResult.entrySet()) {
			sortedList.add(entry.getValue());
		}

		Collections.sort(sortedList, Deliveries.economyResult);

		for (final Object object : sortedList) {

			LOG.info("Year" + " | " + " Team" + " | " + "Economy");

			LOG.info(((Matches) object).getSeason() + "| " + ((Deliveries) object).getBowler() + "|"
					+ ((Deliveries) object).getEconomy());

			count = count + 1;

			if (count == 10) {
				break;
			}
		}
	}
}