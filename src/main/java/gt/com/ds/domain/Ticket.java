package gt.com.ds.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Esta entidad se utiliza para mapear la tabla ticket, que es donde se registran las 
 * gestiones y las anomalias
 *
 * @author cjbojorquez
 * 
 * 
 */

@Data
@Entity
@Table(name = "ticket")
public class Ticket implements Serializable {
    
    private static final long serialVerionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idticket")
    private Long idTicket;
    
    @NotEmpty
    @Column(name="subject")
    private String asunto;
    
    @NotEmpty
    @Column(name="description")
    private String descripcion;
    
    @NotEmpty
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="creation_date")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date fecha;
    
    @ManyToOne
    @JoinColumn(name = "iduser")
    private Usuario usuario;
    
    @Column(name="idticket_type")
    private Long idTipo;
    
    @ManyToOne
    @JoinColumn(name = "idstatus")
    private EstadoTicket estado;
    
    @Column(name="idresidential")
    private Long idResidencial;
    
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Column(name="create_time")
    private Date fechaCrea;
    
    @Column(name="create_user")
    private Long usuarioCrea;
    
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Column(name="modify_time")
    private Date fechaModifica;
    
    @Column(name="modify_user")
    private Long usuarioModifica;
        
}
