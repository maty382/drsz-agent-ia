package sn.yaatout.gestioncourrier.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.yaatout.gestioncourrier.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    Iterable<Notification> findByStatut(String statut);
}