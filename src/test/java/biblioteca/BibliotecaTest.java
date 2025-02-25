package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Libro libro;
    Biblioteca biblioteca = new Biblioteca ();

    @BeforeEach
    void setUp() {
       libro = new Libro ("The Art of Computer Programming", "Donald Knuth", 1968);
    }

    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(this.libro));
    }

    @Test
    void eliminarLibro() {
        assertTrue(biblioteca.eliminarLibro(this.libro));
    }

    @Test
    void getLibros() {
        assertNotNull(biblioteca.getLibros());
    }

    @Test
    void encuentraLibroPorTitulo() {
        boolean b = biblioteca.agregarLibro(this.libro);

        //No está vacía
        assertNotNull(biblioteca.getLibros());

        //Solo tiene un libro
        assertEquals(biblioteca.getLibros().size(),1);

        //Contiene el libro recién añadido
        assertTrue(biblioteca.getLibros().contains(this.libro));

    }

    @Test
    void encuentraLibrosPorAutor() {
        List<Libro> libro = new ArrayList<>();
        biblioteca.agregarLibro(this.libro);

        //No está vacía
        assertNotNull(biblioteca.getLibros());

        //Solo tiene un libro
        assertEquals(biblioteca.getLibros().size(),1);

        //Contiene el libro recién añadido
        assertTrue(biblioteca.getLibros().contains(this.libro));
    }
}