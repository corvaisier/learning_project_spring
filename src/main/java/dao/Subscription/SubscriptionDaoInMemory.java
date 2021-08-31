package main.java.dao.Subscription;

import java.util.ArrayList;
import java.util.List;

import main.java.domain.Subscription;

public class SubscriptionDaoInMemory implements SubscriptionDao {
    private List<Subscription> subscriptions = new ArrayList<>();

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public List<Subscription> findAll() {
        return subscriptions;
    }

    public Subscription findById(Integer id) {
        return subscriptions.get(id);
    }

    public void add(Subscription subscription) {
        subscriptions.add(subscription);
    }

}
