package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Matthew Z.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "matthewzhang275";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s25-10");
        team.addMember("Matthew Z.");
        team.addMember("Milad H.");
        team.addMember("Andrew C.");
        team.addMember("Mihir K.");
        team.addMember("Junjie L.");
        team.addMember("Benjamin S.");
        return team;
    }
}
