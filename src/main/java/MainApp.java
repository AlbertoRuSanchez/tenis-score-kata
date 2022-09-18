public class MainApp {
    public static void main(String[] args) {

        TenisScoreCalculator tenisScoreCalculator = new TenisScoreCalculator();

        System.out.println("-------------------");
        System.out.println("Game 1");

        System.out.println(tenisScoreCalculator.getScore(1, 0));
        System.out.println(tenisScoreCalculator.getScore(2, 0));
        System.out.println(tenisScoreCalculator.getScore(3, 0));
        System.out.println(tenisScoreCalculator.getScore(4, 0));

        System.out.println("-------------------");
        System.out.println("Game 2");

        System.out.println(tenisScoreCalculator.getScore(0, 1));
        System.out.println(tenisScoreCalculator.getScore(1, 1));
        System.out.println(tenisScoreCalculator.getScore(2, 1));
        System.out.println(tenisScoreCalculator.getScore(2, 2));
        System.out.println(tenisScoreCalculator.getScore(2, 3));
        System.out.println(tenisScoreCalculator.getScore(3, 3));
        System.out.println(tenisScoreCalculator.getScore(3, 4));
        System.out.println(tenisScoreCalculator.getScore(5, 5));
        System.out.println(tenisScoreCalculator.getScore(4, 6));
        System.out.println(tenisScoreCalculator.getScore(4, 7));

        System.out.println("-------------------");
        System.out.println("Game 3");

        System.out.println(tenisScoreCalculator.getScore(0, 1));
        System.out.println(tenisScoreCalculator.getScore(1, 1));
        System.out.println(tenisScoreCalculator.getScore(2, 1));
        System.out.println(tenisScoreCalculator.getScore(2, 2));
        System.out.println(tenisScoreCalculator.getScore(2, 3));
        System.out.println(tenisScoreCalculator.getScore(3, 3));
        System.out.println(tenisScoreCalculator.getScore(3, 4));
        System.out.println(tenisScoreCalculator.getScore(5, 5));
        System.out.println(tenisScoreCalculator.getScore(6, 5));
        System.out.println(tenisScoreCalculator.getScore(7, 5));

    }
}
