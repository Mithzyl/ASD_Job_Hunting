package Job;

public enum JobState {
    OPEN(1),
    ASSIGNED(2),
    CLOSED(3),
    PAID(4),
    REVIEWED(5);

    JobState(int i) {
    }
}
