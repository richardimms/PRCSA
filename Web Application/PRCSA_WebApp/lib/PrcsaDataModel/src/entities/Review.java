/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 * This class represents an Review used by PRCSA LETS system
 *
 * @author BrianV
 */
public class Review {

    private Long reviewID;
    private Long transactionID;
    private int reviewValue;
    private String reviewText;

    /**
     * Constructor creates a new instance of Review
     */
    public Review() {
    }

    /**
     * Accessor method to retrieve the ID of the review.
     *
     * @return - A Long representing the ID of the review.
     */
    public Long getReviewID() {
        return reviewID;
    }

    /**
     * Accessor method to set the ID of the review.
     *
     * @param reviewID - A Long representing the ID of the review.
     */
    public void setReviewID(Long reviewID) {
        this.reviewID = reviewID;
    }

    /**
     * Accessor method to retrieve the ID of the transaction that the review is
     * given for.
     *
     * @return - A Long representing the ID of the transaction.
     */
    public Long getTransactionID() {
        return transactionID;
    }

    /**
     * Accessor method to set the ID of the transaction that the review is given
     * for.
     *
     * @param transactionID - A Long representing the ID of the transaction.
     */
    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    /**
     * Accessor method to retrieve the rating given.
     *
     * @return - An Integer representing the rating given.
     */
    public int getReviewValue() {
        return reviewValue;
    }

    /**
     * Accessor method to set the rating given.
     *
     * @param reviewValue - An Integer representing the rating given.
     */
    public void setReviewValue(int reviewValue) {
        this.reviewValue = reviewValue;
    }

    /**
     * Accessor method to retrieve the review text given.
     *
     * @return - A String representing the review text given.
     */
    public String getReviewText() {
        return reviewText;
    }

    /**
     * Accessor method to set the review text given.
     *
     * @param reviewText - A String representing the review text given.
     */
    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }
}
