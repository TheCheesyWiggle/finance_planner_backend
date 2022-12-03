package Objects;

public class Receipt {
    private int id;
    private String company;
    private int amount;
    private String type;
    private String notes;

    public Receipt(int id, String company, int amount, String type, String notes) {
        this.id = id;
        this.company = company;
        this.amount = amount;
        this.type = type;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
