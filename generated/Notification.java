 Voici la classe Notification Java pour le projet DRS/Z avec les champs id, message, date, statut conformément aux conventions du projet :

```java
package sn.yaatout.gestioncourrier.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notification")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    private LocalDateTime date;
    private String statut;

}
```