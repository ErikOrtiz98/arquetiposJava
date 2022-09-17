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
@Table(name = "computer")
@NoArgsConstructor
@AllArgsConstructor
public class ComputersDO implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcomputer")
    private int idcomputer;
    
    @Column(name = "brand")
    private String brand;

    @Column(name = "serialnumber")
    private int serialnumber;
    
    @Column(name = "idorder")
    private int idorder;
    
    @Column(name = "idkeyboard")
    private int idkeyboard;
    
    @Column(name = "idmouse")
    private int idmouse;
    
    @Column(name = "idmonitor")
    private int idmonitor;
}
