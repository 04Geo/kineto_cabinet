package org.sda.entities;

import javax.persistence.*;

@Entity
@Table(name = "subscription")
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
    private String subscriptionType;
    private Integer price;
    private Integer subscriptionAvailabilitySessions;

    public Subscription() {
    }

    public Subscription(Integer id, String subscriptionType, Integer price, Integer subscriptionAvailabilitySessions) {
        this.id = id;
        this.subscriptionType = subscriptionType;
        this.price = price;
        this.subscriptionAvailabilitySessions = subscriptionAvailabilitySessions;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSubscriptionAvailabilitySessions() {
        return subscriptionAvailabilitySessions;
    }

    public void setSubscriptionAvailabilitySessions(Integer subscriptionAvailabilitySessions) {
        this.subscriptionAvailabilitySessions = subscriptionAvailabilitySessions;
    }
}
