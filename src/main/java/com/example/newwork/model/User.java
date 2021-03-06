package com.example.newwork.model;

import com.example.newwork.enums.AccountType;
import com.example.newwork.enums.ClientStatus;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;

@Entity
@Data
@Table(name = "User_Table")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "user_id", nullable = false)
    private Long userID;
    private String userFirstName;
    private String userMiddleName;
    private String userLastName;
    private String userAddress;
   @Column(name = "user_email", nullable = false)
    private String userEmail;
    @Column(name = "user_password", nullable = false)
    private String userPassword;
    private String userPhoneNumber;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    @Enumerated(EnumType.STRING)
    private ClientStatus status;
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private Collection<Account>  accounts;

}
