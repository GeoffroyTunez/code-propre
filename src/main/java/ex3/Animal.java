package ex3;

public class Animal {
    private String types;
    private String noms;
    private String comportements;

    /** Constructeur animal
     *
     * @param noms
     * @param types
     * @param comportements
     */
    public Animal(String noms, String types, String comportements) {
        this.noms = noms;
        this.types = types;
        this.comportements = comportements;
    }

    /**
     * Getter for gettypes
     *
     * @return types
     */

    public String getTypes() {
        return types;
    }

    /**
     * Getter for gettypes
     *
     * @return types
     */

    public void setTypes(String types) {
        this.types = types;
    }

    /**
     * Getter for getnoms
     *
     * @return noms
     */

    public String getNoms() {
        return noms;
    }

    /**
     * Getter for getnoms
     *
     * @return noms
     */

    public void setNoms(String noms) {
        this.noms = noms;
    }

    /**
     * Getter for getcomportements
     *
     * @return comportements
     */

    public String getComportements() {
        return comportements;
    }

    /**
     * Getter for getcomportements
     *
     * @return comportements
     */

    public void setComportements(String comportements) {
        this.comportements = comportements;
    }
}
