package rocks.zipcode.typeittogether_springboot.entities;


import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity(name = "document")
@Table(name = "document")
public class Document {


    @Id
    private String title;
    @Column(name = "CREATEDATE")
    private Date createDate;
    private Timestamp lastModified;
    private String lastModifiedBy;
    private String documentLocation;
    private String documentText;
    private String docPermission;

    public String getDocumentTitle() {
        return title;
    }

    public void setDocumentTitle(String title) {
        this.title = title;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Timestamp getLastModified() {
        return lastModified;
    }

    public void setLastModified(Timestamp lastModified) {
        this.lastModified = lastModified;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getDocumentLocation() {
        return documentLocation;
    }

    public void setDocumentLocation(String documentLocation) {
        this.documentLocation = documentLocation;
    }

    public String getDocumentText() {
        return documentText;
    }

    public void setDocumentText(String documentText) {
        this.documentText = documentText;
    }

    public String getDocPermission() {
        return docPermission;
    }

    public void setDocPermission(String docPermission) {
        this.docPermission = docPermission;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentTitle='" + title + '\'' +
                ", createDate=" + createDate +
                ", lastModified=" + lastModified +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", documentLocation='" + documentLocation + '\'' +
                ", documentText='" + documentText + '\'' +
                ", docPermission='" + docPermission + '\'' +
                '}';
    }
}
