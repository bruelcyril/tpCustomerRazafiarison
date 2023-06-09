/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package itu.razafiarison.tpcustomerrazafiarison.jsf;

import itu.razafiarison.tpcustomerrazafiarison.ejb.CustomerManager;
import itu.razafiarison.tpcustomerrazafiarison.entities.Customer;
import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author bruel
 */
/**
 * Backing bean pour la page CustomerList.
 */
@Named(value = "customerBean")
@ViewScoped
public class CustomerBean implements Serializable {

    private List<Customer> customers;

    @EJB
    private CustomerManager customerManager;

    /**
     * Creates a new instance of CustomerMBean
     */
    public CustomerBean() {
    }

    /**
     * Renvoie la liste des clients pour affichage dans une DataTable
     *
     * @return
     */
    public List<Customer> getCustomers() {
        if (customers == null) {
            customers = customerManager.getAllCustomers();
        }
        return customers;
    }

}
