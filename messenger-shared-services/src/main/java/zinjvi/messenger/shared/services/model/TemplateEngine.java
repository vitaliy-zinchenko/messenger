package zinjvi.messenger.shared.services.model;

import javax.persistence.*;

/**
 * Created by Vitaliy on 12/20/2015.
 */
@Entity
@Table(name = "m_template_engine")
public class TemplateEngine {

    @Id
//    @Column(name = "template_engine_id")
    private Long templateEngineId;

    @Enumerated
    private TemplateEngineType templateEngineType;


}
