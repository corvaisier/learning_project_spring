package main.java.service;

import java.util.List;
import java.util.UUID;

import main.java.dao.Gym.GymDao;
import main.java.domain.Gym;

public class GymService {

    private GymDao gymDao;

    public GymService(GymDao gymDao) {
        this.gymDao = gymDao;
    }

    public void add(String gym_Name, String gym_Location) {
        Gym newGym = new Gym(UUID.randomUUID(), gym_Name, gym_Location);
        gymDao.add(newGym);
    }

    public List<Gym> findAll() {
        return gymDao.findAll();
    }
}
