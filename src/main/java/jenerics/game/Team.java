package jenerics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participants> {
    private String name;
    List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
        System.out.println("Создана команда " + name);
    }

    public void addNewMember(T participant) {
        participants.add(participant);
        System.out.println("В команду " + this.name + " вступил участник по имени " + participant.getName() +
                " его возраст " + participant.getAge());
    }

    public void playWithTeam(Team<T> otherTeam) {
        Random random = new Random();
        String winnerName;
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            winnerName = this.name;
        } else winnerName = otherTeam.getName();
        System.out.println("Победила команда " + winnerName);
    }

    public String getName() {
        return name;
    }
}

