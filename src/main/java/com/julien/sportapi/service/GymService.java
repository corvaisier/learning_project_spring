package com.julien.sportapi.service;

import com.julien.sportapi.dao.Gym.GymDao;
import com.julien.sportapi.domain.Gym;

import java.util.List;
import java.util.UUID;


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
