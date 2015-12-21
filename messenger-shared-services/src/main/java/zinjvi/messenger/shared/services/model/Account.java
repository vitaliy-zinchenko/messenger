package zinjvi.messenger.shared.services.model;

import javax.persistence.*;

/**
 * Created by Vitaliy on 12/20/2015.
 */
@Entity
@Table(name = "m_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "account_id")
    private Long accountId;

}
