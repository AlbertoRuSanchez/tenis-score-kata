public class TenisScoreCalculator {

    private static final String ZERO_POINTS = "love";
    private static final String FIFTEEN_POINTS = "fifteen";
    private static final String THIRTY_POINTS = "thirty";
    private static final String FORTY_POINTS = "forty";
    private static final String DEUCE = "deuce";
    private static final String ADVANTAGE = "advantage";
    private static final String SEPARATOR = " ||| ";


    public String getScore(int playerOneScore, int playerTwoScore) {

        if(atLeastOnePlayerHasMoreThanThreePoints(playerOneScore, playerTwoScore)){
            if (playerOneHasTwoMorePoints(playerOneScore, playerTwoScore)) {
                return "Player 1 won the game";
            }
            if (playerTwoHasTwoMorePoints(playerOneScore, playerTwoScore)) {
                return "Player 2 won the game";
            }
        }

        if(haveMoreThanThreePointsEachPlayer(playerOneScore, playerTwoScore)) {
            if (haveSameScores(playerOneScore, playerTwoScore)) {
                return DEUCE;
            }

            if (playerOneScore > playerTwoScore) {
                return ADVANTAGE + SEPARATOR;
            }

            if (playerOneScore < playerTwoScore) {
                return SEPARATOR + ADVANTAGE;
            }
        }
        return getScoreName(playerOneScore) + SEPARATOR + getScoreName(playerTwoScore);

    }

    private boolean haveSameScores(int playerOneScore, int playerTwoScore) {
        return playerOneScore == playerTwoScore;
    }

    private String getScoreName(int score) {
        if(score == 0){
            return ZERO_POINTS;
        }
        if(score == 1){
            return FIFTEEN_POINTS;
        }
        if(score == 2){
            return THIRTY_POINTS;
        }
        if(score == 3){
            return FORTY_POINTS;
        }

        return "";
    }

    private boolean playerOneHasTwoMorePoints(int playerOneScore, int playerTwoScore){
        return playerOneScore - playerTwoScore >= 2;
    }

    private boolean playerTwoHasTwoMorePoints(int playerOneScore, int playerTwoScore){
        return playerTwoScore - playerOneScore >= 2;
    }

    private boolean atLeastOnePlayerHasMoreThanThreePoints(int playerOneScore, int playerTwoScore) {
        return playerOneScore > 2 || playerTwoScore > 2;
    }

    private boolean haveMoreThanThreePointsEachPlayer(int playerOneScore, int playerTwoScore) {
        return playerOneScore > 2 && playerTwoScore > 2;
    }
}
