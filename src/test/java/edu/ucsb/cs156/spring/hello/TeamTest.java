package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void equals_returns_true_for_same_name_and_members() {
        Team team1 = new Team("test-team");
        Team team2 = new Team("test-team");

        assertEquals(team1, team2);
    }

    @Test
    public void equals_returns_true_for_same_object() {
        Team team1 = new Team("test-team");

        assertEquals(team1, team1);
    }

    @Test
    public void equals_returns_false_for_different_name() {
        Team team1 = new Team("test-team");
        Team team2 = new Team("another-team");

        assert(!team1.equals(team2));
    }

    @Test
    public void equals_returns_false_for_null_and_other_type() {
        Team team1 = new Team("test-team");

        assert(!team1.equals(null)); 
        assert(!team1.equals("random-string")); 
    }

    @Test
    public void hashCode_returns_expected_value_for_known_team() {
        Team t = new Team("test-team");

        int result = t.hashCode();
        int expectedResult = -1226298695;

        assertEquals(expectedResult, result);
    }

    @Test
    public void equals_returns_false_when_members_differ_but_names_match() {
        Team team1 = new Team("test-team");
        team1.addMember("Alice");

        Team team2 = new Team("test-team");
        team2.addMember("Bob");

        assert(!team1.equals(team2));
    }
}
