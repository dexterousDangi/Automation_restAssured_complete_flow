package testvagrant.api.test.rcb;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testvagrant.api.listeners.ExtentReporter;
import testvagrant.api.service.rcb.RCBService;
import testvagrant.api.service.rcb.model.Player;
import testvagrant.api.service.rcb.model.RCBTeam;
import testvagrant.api.utils.http.IRestResponse;

public class RCBTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(RCBTest.class);
	private IRestResponse<RCBTeam> rcbData;

	@BeforeClass
	public void setup() {
		LOGGER.info("Setting up RCB tests");
		rcbData = RCBService.getRCBPlayerList();
	}

	@Test(testName = "RCB_01", description = "Validate that team has only 4 foreign players")
	public void validate_that_team_has_only_4_foreign_players() {
		// arrange
		ExtentReporter.info("RCB Team");
		ExtentReporter.info(rcbData.getResponse().prettyPrint());

		// act
		List<Player> listOfForeignPlayers = rcbData.getBody().getPlayer().stream()
				.filter(player -> !player.getCountry().equalsIgnoreCase("India")).collect(Collectors.toList());

		ExtentReporter.info("List of foreign players");
		ExtentReporter.info(listOfForeignPlayers.toString());

		// assert
		Assert.assertTrue(listOfForeignPlayers.size() == 4, "Condition failed [Validate that team has only 4 foreign players]");
	}

	@Test(testName = "RCB_02", description = "Validate that there is atleast 1 wicketkeeper in the team")
	public void validate_that_there_is_atleast_1_wicketkeeper_in_team() {
		Optional<Player> wicketKeeperPresentInTheTeam = rcbData.getBody().getPlayer().stream()
				.filter(player -> player.getRole().equals("Wicket-keeper")).findFirst();

		Assert.assertTrue(wicketKeeperPresentInTheTeam.isPresent(), "Condition failed [Validate that there is atleast 1 wicketkeeper in the team]");

		ExtentReporter.info("Wicketkeeper in the team is...");
		ExtentReporter.info(wicketKeeperPresentInTheTeam.get().toString());
	}

}
