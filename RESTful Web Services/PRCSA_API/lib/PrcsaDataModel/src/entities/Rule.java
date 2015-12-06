/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.math.BigDecimal;

/**
 * This class represents an Rule used by PRCSA LETS system
 *
 * @author BrianV
 */
public class Rule {

    private BigDecimal id;
    private String rule;

    /**
     * Constructor creates a new instance of Rule
     */
    public Rule() {
    }

    /**
     * Accessor method to retrieve the ID of the rule.
     *
     * @return - A BigDecimal representing the ID of the rule.
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Accessor method to set the ID of the rule.
     *
     * @param id - A BigDecimal representing the ID of the rule.
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * Accessor method to retrieve the rule description.
     *
     * @return - A String representing the description of the rule.
     */
    public String getRule() {
        return rule;
    }

    /**
     * Accessor method to set the the rule description.
     *
     * @param rule - A String representing the description of the rule.
     */
    public void setRule(String rule) {
        this.rule = rule;
    }

}
