package com.group8.Tracker;

import java.util.LinkedList;
import java.util.Queue;

public class ActiveJobSeekerStatusTracker {
    private static ActiveJobSeekerStatusTracker single_instance = null;

    public Queue<Integer> activeJobSeekers;

    public Queue<Integer> getActiveJobSeekers() {
        return null;
    }

    public void addToQueue(Integer jobSeekerId){
        activeJobSeekers.add(jobSeekerId);
    }


    // constructor
    private ActiveJobSeekerStatusTracker() {
        this.activeJobSeekers= new LinkedList<Integer>();
    }

    public static ActiveJobSeekerStatusTracker getInstance() {
        if (single_instance == null)
            single_instance = new ActiveJobSeekerStatusTracker();
        return single_instance;
    }
}
