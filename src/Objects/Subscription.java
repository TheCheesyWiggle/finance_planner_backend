package Objects;

public class Subscription {
    private int id;
    private String company_name;
    private int amount;
    private int occurrence;
    private String type;
    private String notes;

    public Subscription(int id, String company_name, int amount, int occurence, String notes) {
        this.id = id;
        this.company_name = company_name;
        this.amount = amount;
        this.occurrence = occurence;
        this.type = type;
        this.notes = notes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getOccurrence() {
        return occurrence;
    }

    public void setOccurrence(int occurrence) {
        this.occurrence = occurrence;
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
