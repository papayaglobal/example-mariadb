package org.example.sboot.domain;

import io.ebean.annotation.History;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Date;

@Getter
@Setter
@Entity
@History
@Table(name = "worker_contract")
public class Contract extends BaseModel {
    String projectName;
    Date startDate;
    Date endDate;
    int baseSalary;
    @ManyToOne(fetch = FetchType.LAZY)
    Worker worker;
}
