import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class TenisScoreCalculatorShould {

    private TenisScoreCalculator underTest;

    @BeforeEach
    void setUp() {
        underTest = new TenisScoreCalculator();
    }

    @ParameterizedTest
    //Given
    @CsvSource({
            "1,0,fifteen ||| love",
            "2,0,thirty ||| love",
            "2,1,thirty ||| fifteen",
            "1,3,fifteen ||| forty"
    })
    void return_score(int playerOneScore, int playerTwoScore, String scoreExpected) {
        //When
        String score = underTest.getScore(playerOneScore, playerTwoScore);

        //Then
        assertThat(score).isEqualTo(scoreExpected);
    }

    @Test
    void end_game_when_a_player_has_at_least_4_points_and_two_more_than_opponent() {
        //Given
        int playerOneGameOneScore = 5;
        int playerTwoGameOneScore = 2;

        int playerOneGameTwoScore = 2;
        int playerTwoGameTwoScore = 5;

        //When
        String scoreGameOne = underTest.getScore(playerOneGameOneScore,playerTwoGameOneScore);
        String scoreGameTwo = underTest.getScore(playerOneGameTwoScore,playerTwoGameTwoScore);

        //Then
        assertThat(scoreGameOne).isNotNull().isNotBlank().isEqualTo("Player 1 won the game");
        assertThat(scoreGameTwo).isNotNull().isNotBlank().isEqualTo("Player 2 won the game");
    }

    @Test
    void return_deuce_if_at_least_three_points_are_scored_by_each_players_and_they_are_equal() {
        //Given
        int playerOneScore = 5;
        int playerTwoScore = 5;

        //When
        String score = underTest.getScore(playerOneScore,playerTwoScore);

        //Then
        assertThat(score).isNotNull().isNotBlank().isEqualTo("deuce");
    }

    @Test
    void return_advantage_for_the_player_who_has_one_more_point_than_the_other_and_both_have_at_least_three_points() {
        //Given
        int playerOneGameOneScore = 6;
        int playerTwoGameOneScore = 5;

        int playerOneGameTwoScore = 5;
        int playerTwoGameTwoScore = 6;

        //When
        String scoreGameOne = underTest.getScore(playerOneGameOneScore,playerTwoGameOneScore);
        String scoreGameTwo = underTest.getScore(playerOneGameTwoScore,playerTwoGameTwoScore);

        //Then
        assertThat(scoreGameOne).isNotNull().isNotBlank().isEqualTo("advantage ||| ");
        assertThat(scoreGameTwo).isNotNull().isNotBlank().isEqualTo(" ||| advantage");
    }
}
