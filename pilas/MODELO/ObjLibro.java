package MODELO;

public class ObjLibro{
    private String Isbn;
    private String Titulo;
    private String Autor;
    private String AñoPublicacion;

    public String getIsbn() {
        return Isbn;
    }
    public void setIsbn(String isbn) {
        Isbn = isbn;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public String getAutor() {
        return Autor;
    }
    public void setAutor(String autor) {
        Autor = autor;
    }
    public String getAñoPublicacion() {
        return AñoPublicacion;
    }
    public void setAñoPublicacion(String añoPublicacion) {
        AñoPublicacion = añoPublicacion;
    }
}