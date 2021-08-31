package main.java;

import main.java.cli.*;
import main.java.dao.Coach.*;
import main.java.dao.Gym.*;
import main.java.dao.Subscription.*;
import main.java.service.*;

public class App {
    public static void main(String[] args) {
        GymDao gymDao = new GymDaoInMemory();
        GymService gymService = new GymService(gymDao);
        CoachDao coachDao = new CoachDaoInMemory();
        CoachService coachService = new CoachService(coachDao);
        SubscriptionDao subscriptionDao = new SubscriptionDaoInMemory();
        SubscriptionService subscriptionService = new SubscriptionService(subscriptionDao);
        CliController cliController = new CliController(gymService, coachService, subscriptionService);

        initGymData(gymService);
        initCoachData(coachService);
        initSubscriptionData(subscriptionService);
        cliController.start();
    }

    private static void initGymData(GymService gymService) {
        gymService.add("Paf Gym !", "Vannes");
        gymService.add("Paf Paf Gym !", "Surzur");
    }

    private static void initCoachData(CoachService coachService) {
        coachService.add("Suuuper coach");
        coachService.add("coach trop fort !");
    }

    private static void initSubscriptionData(SubscriptionService subscriptionService) {
        subscriptionService.add();
        subscriptionService.add();
    }

}
