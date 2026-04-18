 Dans le fichier `src/main/java/sn/yaatout/gestioncourrier/repository/NotificationRepository.java`, vous trouverez le code suivant :

```java
package sn.yaatout.gestioncourrier.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.yaatout.gestioncourrier.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    Iterable<Notification> findByStatut(String statut);
}
```

Ce code crée une interface `NotificationRepository` étendant de `JpaRepository` pour gérer la persistance des entités de type `Notification`. L'interface contient également une méthode `findByStatut()`, permettant de rechercher les notifications par leur statut spécifique.