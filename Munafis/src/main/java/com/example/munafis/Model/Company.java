package com.example.munafis.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(columnDefinition = "varchar(50) not null unique")
    @NotNull(message = "UserName cannot be null")
    private String username;
    @Column
    @NotNull(message = "Password cannot be null")
    @Min(value = 6,message = "password must be at least 6 characters")
    private String password;
    @Column(columnDefinition = "varchar(50) not null unique")
    @Email(message = "Must be a valid email")
    @NotNull(message = "email cannot be null")
    private String email;
    @Column(columnDefinition = "varchar(50) not null")
    @NotNull(message = "company name cannot be null")
    private String companyName;
    @Column(columnDefinition = "varchar(50) not null unique")
    @NotNull(message = "business number cannot be null")
    private String businessNumber;
    @Column(columnDefinition = "varchar(50) not null")
    @NotNull(message = "address cannot be null")
    private String address;
    @Column(columnDefinition = "varchar(8) check(role = 'Company' or role='Provider')")
    @NotNull(message = "role cannot be null")
    private String role;


    @ManyToOne
    @JoinColumn(name = "orderr_id" , referencedColumnName = "id")
    @JsonIgnore
    private Orderr orderr;


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "company")
    private Set<RFP> rfps;
}
