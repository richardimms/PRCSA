/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 * This class represents an Bid used by PRCSA LETS system
 *
 * @author BrianV
 */
public class Bid {

    /**
     * Constructor creates a new instance of Bid
     */
    public Bid() {
    }

    Long ID;
    Long advertID;
    Long offererID;
    String offererName;
    Long offereeID;
    String offereeName;
    String text;
    String returnMessage;
    Date bidDate;
    String advertTitle;
    int advertTypeID;
    String isAccepted;
    String bidCompleted;

    /**
     * Accessor method to retrieve the ID of the bid
     *
     * @return - A Long representing the ID of the bid
     */
    public Long getID() {
        return ID;
    }

    /**
     * Accessor method to set the ID of the bid
     *
     * @param ID - A Long representing the ID of the bid
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Accessor method to retrieve the ID of the advert the bid belongs to.
     *
     * @return - A Long representing the ID of the advert the bid belongs to.
     */
    public Long getAdvertID() {
        return advertID;
    }

    /**
     * Accessor method to set the ID of the advert the bid belongs to.
     *
     * @param advertID - A Long representing the ID of the advert the bid
     * belongs to.
     */
    public void setAdvertID(Long advertID) {
        this.advertID = advertID;
    }

    /**
     * Accessor method to retrieve the ID of the member who sent the bid.
     *
     * @return - A Long representing the ID of the member who sent the bid.
     */
    public Long getOffererID() {
        return offererID;
    }

    /**
     * Accessor method to set the ID of the member who sent the bid.
     *
     * @param offererID - A Long representing the ID of the member who sent the
     * bid.
     */
    public void setOffererID(Long offererID) {
        this.offererID = offererID;
    }

    /**
     * Accessor method to retrieve the ID of the member who receives the bid.
     *
     * @return - A Long representing the ID of the member who receives the bid.
     */
    public Long getOffereeID() {
        return offereeID;
    }

    /**
     * Accessor method to set the ID of the member who receives the bid.
     *
     * @param offereeID - A Long representing the ID of the member who receives
     * the bid.
     */
    public void setOffereeID(Long offereeID) {
        this.offereeID = offereeID;
    }

    /**
     * Accessor method to retrieve the message sent with the bid.
     *
     * @return - A String representing the message sent with the bid.
     */
    public String getText() {
        return text;
    }

    /**
     * Accessor method to set the message sent with the bid.
     *
     * @param text - A String representing the message sent with the bid.
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Accessor method to retrieve the date the bid was sent.
     *
     * @return - A Date object representing the date the bid was sent
     */
    public Date getBidDate() {
        return bidDate;
    }

    /**
     * Accessor method to set the date the bid was sent.
     *
     * @param offerDate - A Date object representing the date the bid was sent
     */
    public void setBidDate(Date offerDate) {
        this.bidDate = offerDate;
    }

    /**
     * Accessor method to retrieve the name of the member who sent the bid.
     *
     * @return - A String representing the name of the member who sent the bid.
     */
    public String getOffererName() {
        return offererName;
    }

    /**
     * Accessor method to set the name of the member who sent the bid.
     *
     * @param offererName - A String representing the name of the member who
     * sent the bid.
     */
    public void setOffererName(String offererName) {
        this.offererName = offererName;
    }

    /**
     * Accessor method to retrieve the name of the member who receives the bid.
     *
     * @return - A String representing the name of the member who receives the
     * bid.
     */
    public String getOffereeName() {
        return offereeName;
    }

    /**
     * Accessor method to set the name of the member who receives the bid.
     *
     * @param offereeName - A String representing the name of the member who
     * receives the bid.
     */
    public void setOffereeName(String offereeName) {
        this.offereeName = offereeName;
    }

    /**
     * Accessor method to retrieve the title of the advert the bid belongs to.
     *
     * @return - A String representing the title of the advert the bid belongs
     * to.
     */
    public String getAdvertTitle() {
        return advertTitle;
    }

    /**
     * Accessor method to set the title of the advert the bid belongs to.
     *
     * @param advertTitle - A String representing the title of the advert the
     * bid belongs to.
     */
    public void setAdvertTitle(String advertTitle) {
        this.advertTitle = advertTitle;
    }

    /**
     * Accessor method to retrieve the advert type ID.
     *
     * @return - An Integer representing the advert type ID.
     */
    public int getAdvertTypeID() {
        return advertTypeID;
    }

    /**
     * Accessor method to set the advert type ID.
     *
     * @param advertTypeID - An Integer representing the advert type ID.
     */
    public void setAdvertTypeID(int advertTypeID) {
        this.advertTypeID = advertTypeID;
    }

    /**
     * Accessor method to retrieve whether the bid has been accepted.
     *
     * @return - A String representing whether the bid has been accepted.
     */
    public String getIsAccepted() {
        return isAccepted;
    }

    /**
     * Accessor method to set whether the bid has been accepted.
     *
     * @param isAccepted - A String representing whether the bid has been
     * accepted.
     */
    public void setIsAccepted(String isAccepted) {
        this.isAccepted = isAccepted;
    }

    /**
     * Accessor method to retrieve whether the bid has been completed.
     *
     * @return - A String representing whether the bid has been completed.
     */
    public String getBidCompleted() {
        return bidCompleted;
    }

    /**
     * Accessor method to set whether the bid has been completed.
     *
     * @param bidCompleted - A String representing whether the bid has been
     * completed.
     */
    public void setBidCompleted(String bidCompleted) {
        this.bidCompleted = bidCompleted;
    }

    /**
     * Accessor method to retrieve the return message sent by the replier to the
     * bid.
     *
     * @return - A String representing the return message sent by the replier to
     * the bid.
     */
    public String getReturnMessage() {
        return returnMessage;
    }

    /**
     * Accessor method to set the return message sent by the replier to the bid.
     *
     * @param returnMessage - A String representing the return message sent by
     * the replier to the bid.
     */
    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

}
