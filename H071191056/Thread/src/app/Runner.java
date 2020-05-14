package app;

/**
 * Runner
 */
public class Runner implements Runnable {

    private int number;
    private Thread thread;
    private Race race;

    public Runner(int number) {
        this.number = number;
       
    }

    public Runner joinRace(Race race) {
        thread = new Thread(this);
        this.race = race;
        runnerEnter();
        //thread.setName(String.format("Runner-%d", number));
        //thread.setName(getName());
        return this;
    }

    public String getThreadName(){
        String name = "Runner-" + number;
        return name;
    }

    public int runnerEnter(){
        race.runnerJoin++;
        return race.runnerJoin;
    }

    public void start() {
        if (race.startRace && thread != null) {
            thread.start();
        } else if (!race.startRace) {
            System.out.printf("Hey Runner-%d, The race hasn't started yet\n", number);
        } else {
            System.out.printf("Runner-%d have not entered any race\n",number);
        }
    }

    @Override
    public void run() {
        System.out.printf("%s running\n", getThreadName());
        //!System.out.printf("%s running\n", getThreadName());
        finish();
    }

    public void finish(){
        race.competitionResult.add(number);
    }
}