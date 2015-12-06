package entities;

import java.util.Date;

/**
 * This class represents an Transaction used by PRCSA LETS system
 *
 * @author BrianV
 */
public class Transaction {

    private Long id;
    private Long advertID;
    private int advertTypeID;
    private String payer;
    private Long payerID;
    private String payee;
    private Long payeeID;
    private String title;
    private Long creditPaid;
    private Date dateCompleted;
    private String reviewText;
    private int reviewRating;

    /**
     * Constructor creates a new instance of Transaction
     */
    public Transaction() {

    }

    /**
     * Accessor method to retrieve the title of the advert that the transaction
     * belongs to.
     *
     * @return - A String representing the title of the advert that the
     * transaction belongs to.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Accessor method to set the title of the advert that the transaction
     * belongs to.
     *
     * @param title - A String representing the title of the advert that the
     * transaction belongs to.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Accessor method to retrieve the ID of the transaction.
     *
     * @return - A Long representing the ID of the transaction.
     */
    public Long getId() {
        return id;
    }

    /**
     * Accessor method to set the ID of the transaction.
     *
     * @param id - A Long representing the ID of the transaction.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Accessor method to retrieve the ID of the advert that the transaction
     * belongs to.
     *
     * @return - A Long representing the ID of the advert that the transaction
     * belongs to.
     */
    public Long getAdvertID() {
        return advertID;
    }

    /**
     * Accessor method to set the ID of the advert that the transaction belongs
     * to.
     *
     * @param advertID - A Long representing the ID of the advert that the
     * transaction belongs to.
     */
    public void setAdvertID(Long advertID) {
        this.advertID = advertID;
    }

    /**
     * Accessor method to retrieve the name of the member paying in this
     * transaction.
     *
     * @return - A String representing the name of the member paying in this
     * transaction.
     */
    public String getPayer() {
        return payer;
    }

    /**
     * Accessor method to set the name of the member paying in this transaction.
     *
     * @param payer - A String representing the name of the member paying in
     * this transaction.
     */
    public void setPayer(String payer) {
        this.payer = payer;
    }

    /**
     * Accessor method to retrieve the name of the member being paid in this
     * transaction.
     *
     * @return - A String representing the name of the member being paid in this
     * transaction.
     */
    public String getPayee() {
        return payee;
    }

    /**
     * Accessor method to set the name of the member being paid in this
     * transaction.
     *
     * @param payee - A String representing the name of the member being paid in
     * this transaction.
     */
    public void setPayee(String payee) {
        this.payee = payee;
    }

    /**
     * Accessor method to retrieve the amount of credits being paid.
     *
     * @return - A Long representing the amount of credits being paid.
     */
    public Long getCreditPaid() {
        return creditPaid;
    }

    /**
     * Accessor method to set the amount of credits being paid.
     *
     * @param creditPaid - A Long representing the amount of credits being paid.
     */
    public void setCreditPaid(Long creditPaid) {
        this.creditPaid = creditPaid;
    }

    /**
     * Accessor method to retrieve the date the transaction was completed.
     *
     * @return - A Date object representing the date the transaction was
     * completed.
     */
    public Date getDateCompleted() {
        return dateCompleted;
    }

    /**
     * Accessor method to set the date the transaction was completed.
     *
     * @param dateCompleted - A Date object representing the date the
     * transaction was completed.
     */
    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    /**
     * Accessor method to retrieve the type of the advert.
     *
     * @return - An Integer representing the type of the advert.
     */
    public int getAdvertTypeID() {
        return advertTypeID;
    }

    /**
     * Accessor method to set the type of the advert.
     *
     * @param advertTypeID - An Integer representing the type of the advert.
     */
    public void setAdvertTypeID(int advertTypeID) {
        this.advertTypeID = advertTypeID;
    }

    /**
     * Accessor method to retrieve the review left by the payer.
     *
     * @return - A String representing the review left by the payer.
     */
    public String getReviewText() {
        return reviewText;
    }

    /**
     * Accessor method to set the review left by the payer.
     *
     * @param reviewText - A String representing the review left by the payer.
     */
    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    /**
     * Accessor method to retrieve the rating left by the payer about the other
     * member.
     *
     * @return - An Integer representing the rating left by the payer about the
     * other member.
     */
    public int getReviewRating() {
        return reviewRating;
    }

    /**
     * Accessor method to set the rating left by the payer about the other
     * member.
     *
     * @param reviewRating - An Integer representing the rating left by the
     * payer about the other member.
     */
    public void setReviewRating(int reviewRating) {
        this.reviewRating = reviewRating;
    }

    /**
     * Accessor method to retrieve the payer's ID
     *
     * @return - A Long representing the payer's ID
     */
    public Long getPayerID() {
        return payerID;
    }

    /**
     * Accessor method to set the payer's ID
     *
     * @param payerID - A Long representing the payer's ID
     */
    public void setPayerID(Long payerID) {
        this.payerID = payerID;
    }

    /**
     * Accessor method to retrieve the payee's ID
     *
     * @return - A Long representing the payee's ID
     */
    public Long getPayeeID() {
        return payeeID;
    }

    /**
     * Accessor method to set the payee's ID
     *
     * @param payeeID - A Long representing the payee's ID
     */
    public void setPayeeID(Long payeeID) {
        this.payeeID = payeeID;
    }

}
