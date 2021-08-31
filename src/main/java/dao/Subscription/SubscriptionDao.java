package main.java.dao.Subscription;

import java.util.List;

import main.java.domain.Subscription;

public interface SubscriptionDao {
    List<Subscription> findAll();
    Subscription findById(Integer id);
    void add(Subscription subscription);
}
