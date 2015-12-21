package zinjvi.messenger.shared.services.model;

import javax.persistence.*;

/**
 * Created by Vitaliy on 12/20/2015.
 */
@Entity
@Table(name = "m_template")
public class Template {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "template_id")
    private Long templateId;

    private String value;

    @ManyToOne
    @JoinColumn(name = "template_engine_id")
    private TemplateEngine templateEngine;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

}
