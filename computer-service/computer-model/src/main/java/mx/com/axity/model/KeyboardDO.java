package mx.com.axity.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "keyboards")
@NoArgsConstructor
@AllArgsConstructor
public class KeyboardDO implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idkeyboard")
    private int idkeyboard;
    
    @Column(name = "brand")
    private String brand;

    @Column(name = "serialnumber")
    private int serialnumber;
    
    @Column(name = "model")
    private int model;
}
