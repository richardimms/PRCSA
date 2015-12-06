/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class represents an Advert used by PRCSA LETS system
 *
 * @author BrianV
 */
@XmlRootElement
public class Advert {

    private Long id;
    private String title;
    private String image;
    private String description;
    private Long member_id;
    private Date date_adv;
    private String advert_type;
    private String category;
    private String item_type;
    private Date date_exp;
    private int cost;
    private Boolean transport;
    private String is_active;

    /**
     * Constructor creates a new instance of Advert
     */
    public Advert() {
    }

    /**
     * Accessor method to retrieve the ID of the advert
     *
     * @return - A Long representing the ID of the advert
     */
    public Long getId() {
        return id;
    }

    /**
     * Accessor method to set the ID of the advert
     *
     * @param id - A Long representing the ID of the advert
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Accessor method to retrieve the title of the advert.
     *
     * @return - A String representing the title of the advert
     */
    public String getTitle() {
        return title;
    }

    /**
     * Accessor method to set the title of the advert.
     *
     * @param title - A String representing the title of the advert
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Accessor method to retrieve the image belonging to the advert.
     *
     * @return - A String representing the image of the advert
     */
    public String getImage() {
        return image;
    }

    /**
     * Accessor method to set the image belonging to the advert.
     *
     * @param image - A String representing the image of the advert
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Accessor method to retrieve the description of the advert
     *
     * @return - A String representing the description of the advert
     */
    public String getDescription() {
        return description;
    }

    /**
     * Accessor method to set the description of the advert
     *
     * @param description - A String representing the description of the advert
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Accessor method to retrieve the date the advert was added.
     *
     * @return - A Date object representing the date added of the advert
     */
    public Date getDate_adv() {
        return date_adv;
    }

    /**
     * Accessor method to set the date the advert was added.
     *
     * @param date_adv - A Date object representing the date added of the advert
     */
    public void setDate_adv(Date date_adv) {
        this.date_adv = date_adv;
    }

    /**
     * Accessor method to retrieve the category the advert belongs to.
     *
     * @return - A String representing the category of the advert
     */
    public String getCategory() {
        return category;
    }

    /**
     * Accessor method to set the category the advert belongs to.
     *
     * @param category - A String representing the category of the advert
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Accessor method to retrieve the type of item the advert is offering.
     *
     * @return - A String representing the type of item the advert is about.
     */
    public String getItem_type() {
        return item_type;
    }

    /**
     * Accessor method to set the type of item the advert is offering.
     *
     * @param item_type - A String representing the type of item the advert is
     * about.
     */
    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    /**
     * Accessor method to retrieve the expiry date of the advert.
     *
     * @return - A Date object representing the expiry date of the advert.
     */
    public Date getDate_exp() {
        return date_exp;
    }

    /**
     * Accessor method to set the expiry date of the advert.
     *
     * @param date_exp - A Date object representing the expiry date of the
     * advert.
     */
    public void setDate_exp(Date date_exp) {
        this.date_exp = date_exp;
    }

    /**
     * Accessor method to retrieve the cost of the advert
     *
     * @return - A Integer representing the cost of the advert
     */
    public int getCost() {
        return cost;
    }

    /**
     * Accessor method to set the cost of the advert
     *
     * @param cost - A Integer representing the cost of the advert
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * Accessor method to retrieve whether transport is included with advert.
     *
     * @return - A Boolean representing if transport is included.
     */
    public Boolean getTransport() {
        return transport;
    }

    /**
     * Accessor method to set whether transport is included with advert.
     *
     * @param transport - A Boolean representing if transport is included.
     */
    public void setTransport(Boolean transport) {
        this.transport = transport;
    }

    /**
     * Accessor method to retrieve the members ID who owns the advert.
     *
     * @return - A Long representing the member ID of the advert.
     */
    public Long getMember_id() {
        return member_id;
    }

    /**
     * Accessor method to set the members ID who owns the advert.
     *
     * @param member_id - A Long representing the member ID of the advert
     */
    public void setMember_id(Long member_id) {
        this.member_id = member_id;
    }

    /**
     * Accessor method to retrieve whether the advert is active or not. customer
     *
     * @return - A String representing whether the advert is active or not (Y/N)
     */
    public String getIs_active() {
        return is_active;
    }

    /**
     * Accessor method to set whether the advert is active or not.
     *
     * @param is_active - A String representing whether the advert is active or
     * not (Y/N)
     */
    public void setIs_active(String is_active) {
        this.is_active = is_active;
    }

    /**
     * Accessor method to retrieve the type of advert this is (Offer/Request).
     *
     * @return - A String representing the type of advert.
     */
    public String getAdvert_type() {
        return advert_type;
    }

    /**
     * Accessor method to set the type of advert this is (Offer/Request).
     *
     * @param advert_type - A String representing the type of advert.
     */
    public void setAdvert_type(String advert_type) {
        this.advert_type = advert_type;
    }

}
