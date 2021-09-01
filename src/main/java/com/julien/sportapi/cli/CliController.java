package com.julien.sportapi.cli;

import com.julien.sportapi.domain.Coach;
import com.julien.sportapi.domain.Gym;
import com.julien.sportapi.domain.Subscription;
import com.julien.sportapi.service.CoachService;
import com.julien.sportapi.service.GymService;
import com.julien.sportapi.service.SubscriptionService;

import java.util.List;
import java.util.Scanner;


public class CliController {
    // a un dépendance vers bookService
    private GymService GymService;
    private CoachService CoachService;
    private SubscriptionService SubscriptionService;

    public CliController(GymService GymService, CoachService CoachService, SubscriptionService SubscriptionService) {
        this.GymService = GymService;
        this.CoachService = CoachService;
        this.SubscriptionService = SubscriptionService; 
    }

    public void start() {
        System.out.println("--------------------");
        System.out.println("1 - Do you want to see all gyms ? -");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("2 - Do you want to see all coachs ? -");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("3 - Do you want to manage your subscription ? -");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("4 - Do you want to find a subscription by id ? -");
        System.out.println("--------------------");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        if (choice.equals("1")) {
            List<Gym> allGyms = GymService.findAll();
            for (Gym currentGym : allGyms) {
                System.out.println(currentGym);
            }
        }
        if (choice.equals("2")) {
            List<Coach> allCoachs = CoachService.findAll();
            for (Coach currentCoach : allCoachs) {
                System.out.println(currentCoach);
            }
        }
        if (choice.equals("3")) {
            List<Subscription> allSubscriptions = SubscriptionService.findAll();
            for (Subscription currentSubscription : allSubscriptions) {
                System.out.println(currentSubscription);
            }
        }
        if (choice.equals("4")) {
            System.out.println("--------------------");
            System.out.println("- Do you want to find a subscription by id ?  Enter id -");
            System.out.println("--------------------");
            String subscriptionChoice = scanner.next();
            Integer id =  Integer.parseInt(subscriptionChoice);
            Subscription subscription = SubscriptionService.findById(id);
                System.out.println(subscription);
        }
        scanner.close();
    }
}
