/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author haoliu
 */
public class Application {

    private VitalSignHistory history;
    private MedicineCatalog catalog;
    
    public Application() {
        this.catalog = new MedicineCatalog();
        this.history = new VitalSignHistory();
    }

    /**
     * @return the history
     */
    public VitalSignHistory getHistory() {
        return history;
    }

    /**
     * @param history the history to set
     */
    public void setHistory(VitalSignHistory history) {
        this.history = history;
    }

    /**
     * @return the catalog
     */
    public MedicineCatalog getCatalog() {
        return catalog;
    }

    /**
     * @param catalog the catalog to set
     */
    public void setCatalog(MedicineCatalog catalog) {
        this.catalog = catalog;
    }
    
    
}
