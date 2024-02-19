package ExerciciosDeAula;

public class Contato{
    private String nome;
    private String zap;

    public Contato(String nome, String zap){
        this.nome = nome;
        this.zap = zap;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getZap() {
        return zap;
    }

    public void setZap(String zap) {
        this.zap = zap;
    }

    @Override
    public String toString() {
        return "Contato de" + nome + ", zap=" + zap;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((zap == null) ? 0 : zap.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (zap == null) {
            if (other.zap != null)
                return false;
        } else if (!zap.equals(other.zap))
            return false;
        return true;
    }    
    
}
