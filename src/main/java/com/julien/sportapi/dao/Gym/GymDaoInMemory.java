package com.julien.sportapi.dao.Gym;

import com.julien.sportapi.domain.Gym;

import java.util.ArrayList;
import java.util.List;

public class GymDaoInMemory implements GymDao {
    private List<Gym> gyms = new ArrayList<>();

    public List<Gym> findAll() {
        return gyms;
    }

    public void add(Gym gym) {
        gyms.add(gym);
    }
}
