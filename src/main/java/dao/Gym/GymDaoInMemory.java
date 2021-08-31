package main.java.dao.Gym;

import java.util.ArrayList;
import java.util.List;

import main.java.domain.Gym;

public class GymDaoInMemory implements GymDao {
    private List<Gym> gyms = new ArrayList<>();

    public List<Gym> findAll() {
        return gyms;
    }

    public void add(Gym gym) {
        gyms.add(gym);
    }
}
