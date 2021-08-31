package main.java.dao.Coach;

import java.util.ArrayList;
import java.util.List;

import main.java.domain.Coach;

public class CoachDaoInMemory implements CoachDao {
    private List<Coach> coachs = new ArrayList<>();

    public List<Coach> findAll() {
        return coachs;
    }

    public Coach findById(Integer id) {
        return coachs.get(id);
    }

    public void add(Coach coach) {
        coachs.add(coach);
    }

    public void delete(String coach_Name) {
        Coach coach = coachs.stream()
                .filter(coach -> coach.getCoach_Name().equals(coach_Name)).;
        coachs.remove(coach.getClass());
    }

}
