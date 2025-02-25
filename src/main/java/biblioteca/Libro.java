package biblioteca;

/**
 * Clase que representa un libro . En ella están los atributos de la clase, constructor con parámetros
 * y el constructor sin parámetros y los getter&setter de cada atributo.
 */
public class Libro {

    // TODO: Documentar estos atributos
    /**
     * Atributos: PROPIEDADES de la clase libro
     */
    /**
     * Valor cadena de caracteres, texto
     */
    private String titulo;
    /**
     * Valor cadena de caracteres, texto
     */
    private String autor;
    /**
     * Valor numérico entero
     */
    private int anioPublicacion;


    // TODO: Documentar este método
    // TODO: Testear este método

    /**
     * Constructor con parámetros definidos
     * @param titulo de tipo cadena de caracteres, texto del titulo del libro
     * @param autor de tipo cadena de caracteres, texto del nombre del autor
     * @param anioPublicacion de tipo entero del año de publicación
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método

    /**
     * Metodo para que busque el autor
     * @return devuelve el Autor
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método

    /**
     * Metodo para que busque el año de publicación del libro
     * @return devuelve el año de publicación del libro
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}