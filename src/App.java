import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Rewards rewards = new Rewards(PathDifficulty.HARD);

        Environment env = new Environment(rewards);
        Graphics g = new Graphics(env);
        Agent aiAgent = new Agent(env, 100000);
        aiAgent.train();

        System.out.println("done!");

        final ArrayList<Position> shortestPath = env.getShortestPath(new Position(0, 0));
        Helpers.printShortestPath(shortestPath);
        g.prepareGUI();
        g.drawEasyMaze();
    }
}
