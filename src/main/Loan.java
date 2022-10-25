package main;

public class Loan {
    private String issueDate;
    private String dataReturned;
    private Integer penalty;

    public Loan(String issueDate, String dataReturned, Integer penalty) {
        this.issueDate = issueDate;
        this.dataReturned = dataReturned;
        this.penalty = penalty;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getDataReturned() {
        return dataReturned;
    }

    public void setDataReturned(String dataReturned) {
        this.dataReturned = dataReturned;
    }

    public Integer getPenalty() {
        return penalty;
    }

    public void setPenalty(Integer penalty) {
        this.penalty = penalty;
    }
}
