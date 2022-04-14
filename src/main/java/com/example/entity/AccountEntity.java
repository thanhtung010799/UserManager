package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "account", schema = "public", catalog = "UserManager")
public class AccountEntity implements Serializable {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "idcity")
    private Integer idcity;

    @Column(name = "iddistrict")
    private Integer iddistrict;

    @Column(name = "idstreet")
    private Integer idstreet;

    @OneToOne
    @JoinColumn(name = "idcity", insertable = false, updatable = false)
    private AddressEntity idcityObj;

    @OneToOne
    @JoinColumn(name = "iddistrict",insertable = false, updatable = false)
    private AddressEntity iddistrictObj;

    @OneToOne
    @JoinColumn(name = "idstreet",insertable = false, updatable = false)
    private AddressEntity idstreetObj;
}
