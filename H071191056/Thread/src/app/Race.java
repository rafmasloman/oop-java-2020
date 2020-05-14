package app;

import java.util.*;

public class Race {

    protected int runnerJoin;
    protected boolean startRace = true;
    protected List<Integer> competitionResult = Collections.synchronizedList(new ArrayList<Integer>());
    // !protected List<Integer> runnerLose = new ArrayList<Integer>();
    
    public void start() {
        if (runnerJoin >= 3) {
            startRace = true;
            System.out.println("The Race Start");
        } else {
            System.out.println("The Race Cannot be Started, runners are not enough");
        }

    }

    public void result() {

        try {
            Thread.sleep(runnerJoin * 1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        while(startRace){
            if(competitionResult.size() == runnerJoin){
                System.out.println("\nThe Race is Over");
                System.out.printf("1st : Runner-%d\n", competitionResult.get(0));
                System.out.printf("2nd : Runner-%d\n", competitionResult.get(1));
                System.out.printf("3rd : Runner-%d\n", competitionResult.get(2));
                System.out.println();
                for (int i = 3; i < competitionResult.size(); i++) {
                    System.out.printf("Runner-%d Loses\n", competitionResult.get(i));
               }
               
               return;
            }
        }
    }
    
}