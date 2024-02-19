package Biblioteca;

public class Livro {
    private String id;
    private String titulo;
    private boolean estahEmprestado;

    public Livro(String id, String titulo, boolean estahEmprestado){
     this.id = id;
     this.titulo = titulo;
     this.estahEmprestado = estahEmprestado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstahEmprestado() {
        return estahEmprestado;
    }

    public void setEstahEmprestado(boolean estahEmprestado) {
        this.estahEmprestado = estahEmprestado;
    }

    public String toString(){
        return "Itentificação = " + this.id + ", de Titularidade: " + "Ele está emprestado?: " + this.estahEmprestado;
    }
    
}
