/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geeks.foodysoft.beans;

/**
 *
 * @author Dell
 */
public class Branch {
    int branch_id;
    String branch_owner_name;
    String branch_address;
    double profit;
    double loss;

    public Branch(int branch_id, String branch_owner_name, String branch_address, double profit, double loss) {
        this.branch_id = branch_id;
        this.branch_owner_name = branch_owner_name;
        this.branch_address = branch_address;
        this.profit = profit;
        this.loss = loss;
    }

    public int getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public String getBranch_owner_name() {
        return branch_owner_name;
    }

    public void setBranch_owner_name(String branch_owner_name) {
        this.branch_owner_name = branch_owner_name;
    }

    public String getBranch_address() {
        return branch_address;
    }

    public void setBranch_address(String branch_address) {
        this.branch_address = branch_address;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getLoss() {
        return loss;
    }

    public void setLoss(double loss) {
        this.loss = loss;
    }
    
    
    
}
