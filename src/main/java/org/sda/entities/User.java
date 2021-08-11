package org.sda.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String password;
    private String username;
    private String cnp;
    private String firstName;
    private String lastName;
    private String telephone;
    private String email;
    private String address;
    @OneToMany(mappedBy = "patient")
    private List<Schedule> patientSchedules = new ArrayList<>();
    @OneToMany(mappedBy = "personnel")
    private List<Schedule> personnelSchedules = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "usersroles",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "roleId"))
    private List<Role> roles = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Subscription> subscriptions = new ArrayList<>();

    public User() {
    }

    public User(Integer id, String password, String username, String cnp,
                String firsName, String lastName, String telephone,
                String email, String address) {
        this.id = id;
        this.password = password;
        this.username = username;
        this.cnp = cnp;
        this.firstName = firsName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firsName) {
        this.firstName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Schedule> getPatientSchedules() {
        return patientSchedules;
    }

    public void setPatientSchedules(List<Schedule> patientSchedules) {
        this.patientSchedules = patientSchedules;
    }

    public List<Schedule> getPersonnelSchedules() {
        return personnelSchedules;
    }

    public void setPersonnelSchedules(List<Schedule> personnelSchedules) {
        this.personnelSchedules = personnelSchedules;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }



}
