// OK - Crée une classe Wilder
// OK - Ajoute les attributs String firstname et boolean aware
// OK - Crée un constructeur permettant d'initialiser firstname et aware
// OK - Ajoute des getters et setters pour tous les attributs, en respectant les conventions
// OK - Ajoute une méthode whoAmI() retournant le texte "Je m'appelle firstname et je suis aware" ou "Je m'appelle firstname et je ne suis pas aware", en fonction de l'état des attributs firstname et aware
// OK - Crée une classe Classroom avec une méthode main()
// OK - Ajoute des références vers plusieurs instances de la classe Wilder dans la méthode main() de Classroom
// OK - Pour chacune des références, affiche le retour de la méthode whoAmI() dans le terminal

// Résultat dans le terminal :
// Je m'appelle Jean-François et je suis aware !
// Je m'appelle Michel et je ne suis pas aware.

public class Wilder {
    private String firstname;
    private boolean aware;
    private String isAware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public String getIsAware() {
        return this.isAware;
    }

    public void setIsAware(String isAware) {
        this.isAware = isAware;
    }

    public String whoAmI() {
        if (this.aware) {
            this.setIsAware(" et je suis aware !");
        } else {
            this.setIsAware(" et je ne suis pas aware.");
        }
        return "Je m'appelle " + this.getFirstname() + isAware;
    }
}