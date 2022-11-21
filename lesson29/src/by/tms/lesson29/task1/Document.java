package by.tms.lesson29.task1;

public class Document {

    String docNumber;
    String date;
    String info;

    public Document(String docNumber, String date, String info) {
        this.docNumber = docNumber;
        this.date = date;
        this.info = info;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Document document = (Document) o;

        if (docNumber != null ? !docNumber.equals(document.docNumber) : document.docNumber != null) return false;
        if (date != null ? !date.equals(document.date) : document.date != null) return false;
        return info != null ? info.equals(document.info) : document.info == null;
    }

    @Override
    public int hashCode() {
        int result = docNumber != null ? docNumber.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (info != null ? info.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Document{" +
                "docNumber='" + docNumber + '\'' +
                ", date='" + date + '\'' +
                ", info='" + info + '\'' +
                '}';
    }


    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
