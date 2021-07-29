package se.callista.blog.tenant_management.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tenant {

    @Id
    @Size(max = 50)
    @Column(name = "tenant_id")
    private String tenantId;

    @Size(max = 60)
    @Column(name = "db")
    private String db;

    @Size(max = 30)
    @Column(name = "password")
    private String password;

    @Size(max = 256)
    @Column(name = "url")
    private String url;

}