package ibaHomework8;

import java.util.HashMap;
import java.util.Map;

public class Schedule {
    private Map<String, Integer> schedule= new HashMap<>();

    public Map<String, Integer> getSchedule() {
        return schedule;
    }

    public void setSchedule(HashMap<String, Integer> schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "schedule=" + schedule +
                '}';
    }
}
