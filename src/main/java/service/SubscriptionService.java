package main.java.service;

import java.util.List;

import main.java.dao.Subscription.SubscriptionDao;
import main.java.domain.Subscription;

public class SubscriptionService {
    
    private SubscriptionDao subscriptionDao;

    public SubscriptionService(SubscriptionDao subscriptionDao) {
        this.subscriptionDao = subscriptionDao;
    }

    public void add() {
        Subscription subscription = new Subscription();
        subscriptionDao.add(subscription);
    }

    public List<Subscription> findAll() {
        return subscriptionDao.findAll();
    }

    public Subscription findById(Integer id) {
        return subscriptionDao.findById(id);
    }
}
