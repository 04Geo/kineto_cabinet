package org.sda.repository;

import org.sda.entities.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SubscriptionRepository extends JpaRepository<Subscription,Integer> {
//    @Query("FROM Subscriptions s WHERE s.userId= :userId")
//    List<Subscription> getAllByUserId(Integer id);
}
